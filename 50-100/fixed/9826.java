@java.lang.Override
public java.lang.String export(be.nikiroo.gofetch.data.Story story) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    append(builder, story, false);
    builder.append("i\r\n");
    if ((story.getComments()) != null) {
        for (be.nikiroo.gofetch.data.Comment comment : story.getComments()) {
            append(builder, comment, "");
        }
    }
    builder.append("i\r\n");
    return builder.toString();
}