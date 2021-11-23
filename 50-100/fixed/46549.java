static boolean isWordfunction(java.util.List<java.lang.String> list, int index) {
    boolean isword = false;
    java.lang.String[] wordproblems = new java.lang.String[]{ "sin" , "cos" , "tan" , "ln" , "log" , "e" , "pi" , "sqrt" , "(" };
    for (int i = 0; i < (wordproblems.length); i++) {
        isword = wordproblems[i].equals(list.get(index));
        if (isword)
            break;
        
    }
    return isword;
}