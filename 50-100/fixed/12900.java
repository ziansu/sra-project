public static java.lang.String omitEveryOther(java.lang.String word) {
    boolean keepCurrent = true;
    int i = 0;
    java.lang.String newSpeak = "";
    while (i < (word.length())) {
        if (keepCurrent) {
            newSpeak += java.lang.String.valueOf(word.charAt(i));
            keepCurrent = false;
        }else {
            keepCurrent = true;
        }
        i++;
    } 
    return newSpeak;
}