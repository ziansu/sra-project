private java.lang.String nextStr(char[] arr) {
    java.lang.String s = "";
    for (int i = 0; (i < (arr.length)) && ((arr[i]) != ','); i++) {
        s += arr[i];
        i++;
    }
    return s;
}