@org.springframework.web.bind.annotation.GetMapping(value = "/adduser")
public java.lang.String addUser(@org.springframework.web.bind.annotation.RequestParam(value = "addUserName")
java.lang.String addUserName) {
    java.lang.System.out.println(addUserName);
    logRepo.save(new com.greenfox.chatapp.Module.Log("/register", "GET", com.greenfox.chatapp.Controller.MainController.CHAT_APP_LOGLEVEL, addUserName));
    if (addUserName.equals("")) {
        return "error";
    }else {
        appUser.setUsername(addUserName);
        appUser.setId(1);
        userRepo.save(appUser);
        return "redirect:/";
    }
}