@org.springframework.web.bind.annotation.RequestMapping(value = "sendMessage", produces = "application/json")
public java.lang.String sendMessage(@org.springframework.web.bind.annotation.RequestParam(value = "to")
java.lang.String to, @org.springframework.web.bind.annotation.RequestParam(value = "from")
java.lang.String from, @org.springframework.web.bind.annotation.RequestParam(value = "message")
java.lang.String msg) {
    com.jkchat.models.ChatMessage cm = new com.jkchat.models.ChatMessage();
    cm.setFrom(from.trim().toLowerCase());
    cm.setMessage(msg);
    userService.putMessage(to.toLowerCase(), cm);
    return "success";
}