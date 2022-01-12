@org.springframework.web.bind.annotation.RequestMapping(path = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String home(org.springframework.ui.Model model) {
    java.util.List<com.theironyard.Message> messageList = ((java.util.List) (messages.findAll()));
    java.util.Collections.sort(messageList);
    model.addAttribute("messages", messageList);
    return "home";
}