@org.springframework.web.bind.annotation.RequestMapping(value = "/Register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String register(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam(value = "Username")
java.lang.String userName, @org.springframework.web.bind.annotation.RequestParam(value = "Password")
java.lang.String passWord) {
    java.lang.System.out.println("Entered Register");
    java.lang.System.out.println(((userName + " ") + passWord));
    if (userManager.addUser(userName, passWord)) {
        model.addAttribute("username", userName);
        java.lang.System.out.println("Du lyckades registrera dig");
        return "home";
    }else
        java.lang.System.out.println("Du misslyckades att registrera dig");
    
    return "error";
}