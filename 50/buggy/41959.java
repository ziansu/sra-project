@javax.annotation.PostConstruct
public void sendStartupEvent() throws java.net.URISyntaxException {
    if ((startupEventSenderClient()) != null) {
        startupEventSenderClient().send();
    }
}