static boolean IsIsogram(java.lang.String answer) {
    answer = answer.toLowerCase();
    int len = answer.length();
    char[] arr = answer.toCharArray();
    java.util.Arrays.sort(arr);
    for (int i = 0; i < (len - 1); i++) {
        if ((arr[i]) == (arr[(i + 1)]))
            return true;
        
    }
    return false;
}