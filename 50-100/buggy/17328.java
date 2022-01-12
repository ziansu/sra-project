public void printItems() {
    int counter = 0;
    for (java.util.Map.Entry<java.lang.String, solo.ittalents.spaska.Item> entry : items.entrySet()) {
        java.lang.String key = entry.getKey();
        java.lang.String value = entry.getValue().getName();
        java.lang.System.out.println("The hero have no items.");
        java.lang.System.out.printf((((key + " - ") + value) + "%n"));
        counter++;
    }
    if (counter == 0) {
        java.lang.System.out.println("The hero have no items.");
    }
}