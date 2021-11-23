private static learnrxjava.types.JSON json(java.lang.Object... keyOrValue) {
    learnrxjava.types.JSON json = new learnrxjava.types.JSON();
    for (int counter = 0; counter < (keyOrValue.length); counter += 2) {
        json.put(((java.lang.String) (keyOrValue[counter])), keyOrValue[(counter + 1)]);
    }
    return json;
}