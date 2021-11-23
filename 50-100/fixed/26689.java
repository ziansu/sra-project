@java.lang.Override
public void subscribe(final java.lang.String topic) throws nanomsg.exceptions.IOException {
    if (topic.isEmpty()) {
        subscribe(new byte[1], 0);
    }
    try {
        subscribe(topic.getBytes("utf-8"));
    } catch (java.io.UnsupportedEncodingException e) {
        throw new nanomsg.exceptions.IOException(e);
    }
}