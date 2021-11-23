public boolean isState(java.lang.String input) {
    boolean matchFound = false;
    int i = 0;
    while ((matchFound == false) && (i < (states.length))) {
        if (states[i].equalsIgnoreCase(input)) {
            matchFound = true;
        }
        i++;
    } 
    return matchFound;
}