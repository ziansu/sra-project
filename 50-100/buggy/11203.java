private boolean bracketsBalanced(java.lang.String input) {
    int i = 0;
    for (char c : input.toCharArray()) {
        if (c == '{')
            i++;
        
        if (c == '}')
            i--;
        
    }
    return (i >= 0) && (i == 0);
}