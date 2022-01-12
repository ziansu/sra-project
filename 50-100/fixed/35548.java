public static void generateCollaztLengths() {
    long longest = 0;
    long longestVal = java.lang.Integer.MIN_VALUE;
    for (int i = 1; i < (ProjectEuler.Problem14.max); i++) {
        long length = ProjectEuler.Problem14.lengthOfCollatzChain(i);
        if (length >= longestVal) {
            longestVal = length;
            longest = i;
        }
        ProjectEuler.Problem14.maxCollatzLengths[i] = longest;
    }
}