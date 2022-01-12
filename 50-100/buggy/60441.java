public static char minuscule(char l) {
    if ((((int) (l)) <= 90) && (((int) (l)) >= 65)) {
        return ((char) (((int) (l)) + 32));
    }else
        return l;
    
}