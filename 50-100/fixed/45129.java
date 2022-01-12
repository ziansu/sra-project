@org.springframework.web.bind.annotation.RequestMapping(value = "/login")
public java.lang.String login(@org.springframework.web.bind.annotation.RequestParam
java.lang.String loginName, @org.springframework.web.bind.annotation.RequestParam
java.lang.String loginPwd, org.springframework.ui.Model model) throws java.lang.Exception {
    com.zdz.model.Member member = memService.memLogin(loginName, loginPwd);
    if (member != null) {
        model.addAttribute("loginMember", member);
    }else {
        java.lang.System.out.println("验证失败");
    }
    return "redirect:default";
}