private boolean bracketsBalanced(java.lang.String input) {
    int i = 0;
    for (char c : input.toCharArray()) {
        if (c == '{')
            i++;
        
        if (c == '}')
            i--;
        
        if (i < 0)
            return false;
        
    }
    return i == 0;
}