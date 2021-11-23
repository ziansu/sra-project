private int index(char symbol) {
    final int start = 26;
    if ((symbol >= 'a') && (symbol <= 'z')) {
        return (start + ((int) (symbol))) - ((int) ('a'));
    }
    return ((int) (symbol)) - ((int) ('A'));
}