public <E> java.lang.String convertArrToString(E[] arr) {
    java.lang.String ret = "";
    for (int i = 0; i < ((arr.length) - 1); i++) {
        ret += (arr[i]) + ",";
    }
    ret += arr[arr.length];
    return ret;
}