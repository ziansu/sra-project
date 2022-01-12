public java.util.ArrayList<java.lang.Integer> guess(int[] lastG, int[] pegs) {
    int i = 0;
    while (i < (narrow.size())) {
        int index = check(i, narrow.get(i), lastG, pegs);
        i += index;
    } 
    return narrow.get(0);
}