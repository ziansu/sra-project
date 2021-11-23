public boolean isFiltered(char[] input, int start, int end) {
    if (end >= (input.length))
        return false;
    
    return (input[end]) == (character);
}