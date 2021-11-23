public static void MakeRandomValuesNegative(java.lang.Integer[] array) {
    if (array == null)
        return ;
    
    java.util.Random r = new java.util.Random();
    for (int i = 0; i < (array.length); i++) {
        if (((r.nextInt()) % 2) == 0) {
            array[i] = -(array[i]);
        }
    }
}