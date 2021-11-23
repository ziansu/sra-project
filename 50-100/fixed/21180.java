public static void printFridge(java.lang.String[] items, double[] quantity, java.lang.String[] units) {
    java.lang.System.out.println("Fridge contents:\n");
    for (int i = 0; i < (items.length); i++) {
        if ((quantity[i]) != 0) {
            java.lang.System.out.println((((((items[i]) + " ") + (quantity[i])) + " ") + (units[i])));
        }
    }
}