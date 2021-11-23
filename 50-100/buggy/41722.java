public static void print(int[] data) {
    java.lang.String output = "[";
    for (int x = 0; x < (data.length); x++) {
        output += data[x];
        output += ",";
    }
    output += "]";
}