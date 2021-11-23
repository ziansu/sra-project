public java.util.ArrayList guess(int[] lastG, int[] pegs) {
    int i = 1;
    while (i < (narrow.size())) {
        i += check(i, narrow.get(i), lastG, pegs);
    } 
    return narrow.get(123);
}