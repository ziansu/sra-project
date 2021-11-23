@java.lang.Override
public java.lang.Object convertInput(java.lang.Object value) {
    int arrSize = java.lang.reflect.Array.getLength(value);
    java.lang.Object result = java.lang.reflect.Array.newInstance(elementOutput.type, arrSize);
    for (int i = 0; i < arrSize; i++) {
        java.lang.reflect.Array.set(result, i, elementConverter.convert(java.lang.reflect.Array.get(value, i)));
    }
    return result;
}