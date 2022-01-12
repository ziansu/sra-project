public static void main(java.lang.String[] args) {
    java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    java.lang.String first = null;
    java.lang.String second = null;
    try {
        first = input.readLine();
        second = input.readLine();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println(StringPermutation.isPermutation(first, second));
}