@org.springframework.web.bind.annotation.RequestMapping(value = { "/joinChatroom" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String joinChatroom(@org.springframework.web.bind.annotation.RequestParam(value = "chatroomId")
int chatroomId, org.springframework.ui.ModelMap model) {
    de.bonobo_talk.SpringMVCTest.model.User user = getPrincipal();
    if (user == null) {
        return "redirect:/index";
    }
    if ((chatroomService.findById(chatroomId)) == null) {
        return "redirect:/chatselect";
    }
    service.leaveAllChatrooms(user);
    service.joinChatroom(user.getId(), chatroomService.findById(chatroomId));
    model.addAttribute("Chatroom", chatroomService.findById(chatroomId));
    model.addAttribute("User", user);
    return "chat";
}