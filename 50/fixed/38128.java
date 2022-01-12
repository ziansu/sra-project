@org.springframework.web.bind.annotation.RequestMapping(value = "/chat.go.to.dialog/{roomId}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public void userGoToDialogListenerLP(@org.springframework.web.bind.annotation.PathVariable(value = "roomId")
java.lang.Long roomid, java.security.Principal principal) {
    userGoToDialogListener(roomid, principal);
}