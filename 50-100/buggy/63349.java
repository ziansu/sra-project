public int[] returnResult() {
    for (int i = 0; i < (givenArray.length); i++) {
        int temp = (target) - (givenArray[i]);
        if (binarySearch(temp)) {
            java.lang.System.out.println(i);
        }
    }
}