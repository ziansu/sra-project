@main.controller.Message(encoders = { main.util.JacksonEncoder.class }, decoders = { main.util.JacksonDecoder.class })
public main.model.Post onMessage(main.model.Post post) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    java.lang.System.out.println(("topic" + (post.getMessage())));
    return post;
}