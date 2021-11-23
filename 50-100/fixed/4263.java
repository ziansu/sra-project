public static void sort(int[] data, int start, int end) {
    for (int index = start; index <= end; index++) {
        int val = data[index];
        int cursor = index;
        while ((cursor > start) && ((data[(cursor - 1)]) > val)) {
            data[cursor] = data[(cursor - 1)];
            cursor--;
        } 
        data[cursor] = val;
    }
}