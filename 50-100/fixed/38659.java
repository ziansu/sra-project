@org.springframework.web.bind.annotation.RequestMapping(value = "/reikningur/breyta-nafni", method = org.springframework.web.bind.annotation.RequestMethod.POST)
private java.lang.String changeUsernameHandler(javax.servlet.http.HttpSession session, @org.springframework.web.bind.annotation.RequestParam(value = "username")
java.lang.String username, org.springframework.ui.ModelMap model) {
    model.addAttribute("username", session.getAttribute("username"));
    accountService.changeName(((java.lang.String) (session.getAttribute("username"))), username);
    model.addAttribute("posts", postService.getAllPosts());
    model.addAttribute("username", ((java.lang.String) (session.getAttribute("username"))));
    return "index";
}