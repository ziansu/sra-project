@org.junit.Test
public void contextLoads() {
    com.github.awesomechat.chat.messages.JoinMessage message = new com.github.awesomechat.chat.messages.JoinMessage();
    message.setName("Sergey");
    com.github.awesomechat.chat.Jsonizer jsonizer = new com.github.awesomechat.chat.Jsonizer();
    java.lang.String jsonMessage = jsonizer.encode(message);
    java.lang.System.out.println(jsonMessage);
}