static boolean IsIsogram(java.lang.String vastaus) {
    vastaus = vastaus.toLowerCase();
    int len = vastaus.length();
    char[] arr = vastaus.toCharArray();
    java.util.Arrays.sort(arr);
    for (int i = 0; i < (len - 1); i++) {
        if ((arr[i]) == (arr[(i + 1)]))
            return true;
        
    }
    return false;
}