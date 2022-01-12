public static void generateCollaztLengths() {
    int longest = 0;
    int longestVal = java.lang.Integer.MIN_VALUE;
    for (int i = 1; i < (ProjectEuler.Problem14.max); i++) {
        int length = ProjectEuler.Problem14.lengthOfCollatzChain(i);
        if (length >= longestVal) {
            longestVal = length;
            longest = i;
        }
        ProjectEuler.Problem14.maxCollatzLengths[i] = longest;
    }
}