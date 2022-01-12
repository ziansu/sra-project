static int maxValueInArray(int[] arr) {
    int max = 0;
    for (int i = 0; i < (arr.length); ++i) {
        max = (max >= (arr[i])) ? max : arr[i];
    }
    return max;
}