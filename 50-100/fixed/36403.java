public int[] returnResult() {
    int[] index = new int[givenArray.length];
    int a = 0;
    for (int i = 0; i < (givenArray.length); i++) {
        int temp = (target) - (givenArray[i]);
        if (binarySearch(temp)) {
            java.lang.System.out.println(i);
            index[a] = i;
            a++;
        }
    }
    return index;
}