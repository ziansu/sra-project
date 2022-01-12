public boolean parses(java.lang.String input) {
    int i = 0;
    currentElement = -1;
    while ((!(input.isEmpty())) && ((elements.size()) >= (i - 1))) {
        java.lang.String rest = elements.get(i).parse(input);
        if (rest == null) {
            return false;
        }
        currentElement = i;
        updateAt(currentElement);
        input = rest;
        i++;
    } 
    return true;
}