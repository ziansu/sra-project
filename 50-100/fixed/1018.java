public static boolean increasingTriplet(int[] nums) {
    int firstMin = java.lang.Integer.MAX_VALUE;
    int secondMin = java.lang.Integer.MAX_VALUE;
    for (int i : nums) {
        if (i <= firstMin) {
            firstMin = i;
        }else
            if (i <= secondMin) {
                secondMin = i;
            }else {
                return true;
            }
        
    }
    return false;
}