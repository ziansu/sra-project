@java.lang.Override
boolean test(com.supersoftcafe.json_stream.Context context) {
    com.supersoftcafe.json_stream.Path.Node node = context.currentNode();
    if (node.isArray()) {
        long arrayIndex = node.getIndex();
        if (((arrayIndex >= (minIndex)) && (arrayIndex <= (maxIndex))) && (((arrayIndex - (minIndex)) % (step)) == 0)) {
            return context.nextRule();
        }
    }
    return false;
}