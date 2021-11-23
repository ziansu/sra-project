private int index(char symbol) {
    final int start = 26;
    if ((symbol >= 'a') && (symbol <= 'z')) {
        return (start + ((int) (symbol))) - ((int) ('a'));
    }else
        if ((symbol >= 'A') && (symbol <= 'Z')) {
            return ((int) (symbol)) - ((int) ('A'));
        }
    
    return -1;
}