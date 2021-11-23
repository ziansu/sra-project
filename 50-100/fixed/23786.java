public int max(int... values) {
    if ((values == null) || ((values.length) == 0)) {
        throw new java.lang.IllegalArgumentException(("Null or empty argument: " + values));
    }
    int result = values[0];
    for (int value : values) {
        if (value > result) {
            result = value;
        }
    }
    return result;
}