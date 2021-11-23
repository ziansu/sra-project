public char[] reverse(char[] input) {
    reverseWord(input, 0, input.length);
    int start = 0;
    int end = 0;
    while (end < (input.length)) {
        if ((input[end]) == ' ') {
            reverseWord(input, start, end);
            start = end + 1;
        }
        end++;
    } 
    reverseWord(input, start, end);
    return input;
}