public boolean next(Text key, Text value) throws java.io.IOException {
    Text nextTitle = new Text();
    Text pageText = new Text();
    boolean hasNext = textToTitle(nextTitle, pageText);
    if (!hasNext) {
        return false;
    }
    key.set(title);
    value.set(nextValue);
    title.set(nextTitle);
    return true;
}