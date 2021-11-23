@org.springframework.web.bind.annotation.RequestMapping(value = { "/joinChatroom" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String joinChatroom(@org.springframework.web.bind.annotation.RequestParam(value = "chatroomId")
int chatroomId, org.springframework.ui.ModelMap model) {
    de.bonobo_talk.SpringMVCTest.model.User user = getPrincipal();
    if (user == null) {
        return "redirect:/index";
    }
    de.bonobo_talk.SpringMVCTest.model.Chatroom currChatroom = chatroomService.findById(chatroomId);
    if (currChatroom == null) {
        return "redirect:/chatselect";
    }
    service.leaveAllChatrooms(user);
    service.joinChatroom(user.getId(), currChatroom);
    model.addAttribute("Chatroom", currChatroom);
    model.addAttribute("User", user);
    return "chat";
}