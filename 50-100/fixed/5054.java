public static int recursiveSearch(int[] inputArray, int searchTarget, int i) {
    int[] input = inputArray;
    if (((input.length) < 1) || (i >= (input.length))) {
        return -1;
    }else
        if ((input[i]) == searchTarget) {
            return i;
        }else {
            return algo.linearsearch.LinearSearch.recursiveSearch(input, searchTarget, (i + 1));
        }
    
}