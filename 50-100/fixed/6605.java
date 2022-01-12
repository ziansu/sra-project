private static in.jaaga.learning.api.ChatReply[] convertToChatReplyOptions(java.lang.String[] options) {
    java.util.ArrayList<in.jaaga.learning.api.ChatReply> replies = new java.util.ArrayList<>(options.length);
    in.jaaga.learning.api.ChatReply reply;
    for (int i = 0; i < (options.length); i++) {
        reply = new in.jaaga.learning.api.ChatReply();
        reply.type = ChatReplyType.Regular;
        reply.displayText = options[i];
        replies.add(reply);
    }
    return replies.toArray(new in.jaaga.learning.api.ChatReply[0]);
}