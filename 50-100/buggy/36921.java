public static int findSecondLargestNumber(int[] input) {
    int largest = java.lang.Integer.MIN_VALUE;
    int secondLargest = java.lang.Integer.MIN_VALUE;
    for (int number : input) {
        if (number >= largest) {
            largest = number;
        }else
            if (number > secondLargest) {
                secondLargest = number;
            }
        
    }
    return secondLargest;
}