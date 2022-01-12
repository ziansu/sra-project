@org.springframework.web.bind.annotation.RequestMapping(value = "/userList")
public java.lang.String userList(java.lang.String username, java.lang.String password, org.springframework.web.servlet.mvc.support.RedirectAttributes attr) {
    java.util.List<com.chas.model.User> list = userService.selectAllUser();
    com.chas.model.User user = userService.selectUserByName(username);
    java.util.List<com.chas.model.Right> rightList = rightService.selectAllRight();
    attr.addFlashAttribute("user", user);
    attr.addFlashAttribute("list", list);
    attr.addFlashAttribute("rightList", rightList);
    return "redirect:/usermg";
}