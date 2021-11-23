public static void main(java.lang.String[] args) {
    final int[] INDEX_ARRAY = new int[]{ 0 , 1 , 2 , 3 , 4 };
    int[] values = new int[]{ 0 , 1 , 2 , 3 , 4 };
    for (int i = 0; i < (INDEX_ARRAY.length); i++) {
        values[INDEX_ARRAY[i]] = i;
    }
}