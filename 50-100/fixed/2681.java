@java.lang.Override
public org.apache.hadoop.io.Text toText(org.apache.hadoop.io.Text text) {
    edu.umn.cs.spatialHadoop.io.TextSerializerHelper.serializeDouble(x, text, ',');
    edu.umn.cs.spatialHadoop.io.TextSerializerHelper.serializeDouble(y, text, (str.isEmpty() ? ' ' : ','));
    text.append(str.getBytes(), 0, str.length());
    return text;
}