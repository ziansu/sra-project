@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/picture/{id}")
public java.lang.String picturePage(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id, org.springframework.ui.Model model, @org.springframework.web.bind.annotation.CookieValue(value = "buyCar", required = false)
java.lang.String buyCarCookie, javax.servlet.http.HttpServletResponse response) throws java.io.UnsupportedEncodingException, java.sql.SQLException {
    model.addAttribute("picId", id);
    tw.com.iwow.entity.Picture picture = pictureService.getById(id);
    model.addAttribute("picture", picture);
    if ((org.apache.commons.lang3.StringUtils.isEmpty(buyCarCookie)) || (buyCarCookie == null)) {
        response.addCookie(new javax.servlet.http.Cookie("buyCar", null));
        java.lang.System.out.println(("buyCarCookieP=" + buyCarCookie));
    }
    return "/iwow/picture";
}