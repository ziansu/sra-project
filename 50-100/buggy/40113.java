public int scoreOf(java.lang.String word) {
    if (word == null)
        throw new java.lang.NullPointerException();
    
    if (dict.contains(word)) {
        switch (word.length()) {
            case 0 :
            case 1 :
            case 2 :
                return 0;
            case 3 :
            case 4 :
                return 1;
            case 5 :
                return 2;
            case 6 :
                return 3;
            case 7 :
                return 5;
            default :
                return 11;
        }
    }
    return 0;
}