public static java.lang.Integer[] integerToObject(int[] array) {
    if (array == null) {
        return null;
    }else
        if ((array.length) == 0) {
            return kankan.wheel.widget.DateTimePicker.EMPTY_INTEGER_OBJECT_ARRAY;
        }
    
    final java.lang.Integer[] result = new java.lang.Integer[array.length];
    for (int i = 0; i < (array.length); i++) {
        result[i] = array[i];
    }
    return result;
}