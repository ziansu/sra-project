private static void appendJoined(java.lang.StringBuilder sb, java.util.Collection<java.lang.Integer> objects) {
    int count = objects.size();
    java.lang.Integer[] array = objects.toArray(new java.lang.Integer[count]);
    sb.append(array[0]);
    for (int i = 1; i < count; i++) {
        sb.append(",").append(array[i]);
    }
}