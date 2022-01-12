@javax.annotation.PostConstruct
public void sendStartupEvent() throws java.net.URISyntaxException {
    startupEventSenderClient().send();
}