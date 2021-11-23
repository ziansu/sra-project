public int calculateRow(java.lang.String string) {
    int sum = 0;
    string = string.trim();
    java.lang.String[] integers = string.split("\\s+");
    try {
        for (int i = 0; i < (integers.length); i++) {
            sum += java.lang.Integer.parseInt(integers[i]);
        }
    } catch (java.lang.NumberFormatException e) {
        java.lang.System.out.println("There string cannot be empty or start with whitspace");
    }
    return sum;
}