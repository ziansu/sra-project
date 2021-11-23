@org.springframework.web.bind.annotation.RequestMapping(value = "/growl-notify")
public java.lang.String index(@org.springframework.web.bind.annotation.RequestParam(value = "title", defaultValue = "Title")
java.lang.String message, @org.springframework.web.bind.annotation.RequestParam(value = "message", defaultValue = "Hello World")
java.lang.String title) throws java.io.IOException, java.lang.InterruptedException {
    if (((client) != null) && (client.isRegistered())) {
        init(growlIPAddress, java.lang.Integer.parseInt(growlPort), growlPassword);
        client.waitRegistration(1L, java.util.concurrent.TimeUnit.SECONDS);
    }
    sendNotification(title, message);
    return "Sent " + message;
}