@org.springframework.web.bind.annotation.GetMapping(value = "/photo")
public void showPhoto(@org.springframework.web.bind.annotation.RequestParam(value = "username")
java.lang.String username, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    com.mokujin.domain.Profile profile = profileService.findByUsername(username);
    response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
    byte[] photo = profile.getPhoto();
    if ((photo.length) == 0) {
        photo = getDefaultPhoto();
    }
    response.getOutputStream().write(photo);
    response.getOutputStream().close();
}