private void initialize(T t) throws com.mickey305.common.v2.exception.InsertObjectTypeException {
    com.mickey305.common.v2.json.io.IterationUtil.checkObjectType(t);
    line = new com.mickey305.common.v2.string.ScannerLine(t.toString());
    prevToken = null;
    index = 0;
    innerJSONArrayStack = new java.util.Stack<>();
}