@org.springframework.web.bind.annotation.RequestMapping(value = "/list", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String list(org.springframework.ui.Model model, @org.springframework.data.web.PageableDefault(value = 2)
org.springframework.data.domain.Pageable pageable, java.security.Principal principal) {
    org.springframework.data.domain.Page<com.arms.domain.entity.User> pageUser = userService.findAll(pageable);
    java.lang.System.out.println(pageable.toString());
    model.addAttribute("page", pageUser);
    model.addAttribute("pagesize", ((com.arms.app.user.UserController.PAGE_SIZE) - 1));
    model.addAttribute("pageable", pageable);
    model.addAttribute("url", "/user/list");
    model.addAttribute("users", pageUser.getContent());
    java.lang.System.out.println(principal);
    return "user/list";
}