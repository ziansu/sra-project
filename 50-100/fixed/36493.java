@org.springframework.web.bind.annotation.GetMapping(value = "/author")
public void author(@org.springframework.web.bind.annotation.RequestParam(name = "id")
java.lang.Integer authorId, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    if (((authors.getAuthor(authorId)) != null) && ((authors.getAuthor(authorId).getImage().length) > 0)) {
        response.setContentType("image/jpeg");
        response.getOutputStream().write(authors.getAuthor(authorId).getImage());
        response.getOutputStream().close();
    }else
        response.sendRedirect("/img/tiwoli.png");
    
}