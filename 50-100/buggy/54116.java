@java.lang.Override
public edu.hm.cs.fs.common.model.Group read(final com.google.gson.stream.JsonReader in) throws java.io.IOException {
    in.beginObject();
    final java.lang.String[] content = new java.lang.String[3];
    extractContent(in, content);
    in.endObject();
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (final java.lang.String aContent : content) {
        if (aContent != null) {
            builder.append(aContent);
        }
    }
    return edu.hm.cs.fs.common.model.Group.of(builder.toString());
}