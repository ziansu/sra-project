public <T> java.lang.String displayItemsAsMenuOptions(java.util.List<T> items) {
    java.lang.System.out.println("Choose an option by typing the corresponding number:");
    java.lang.String result = "";
    int counter = 1;
    for (T item : items) {
        result += ((counter + ". ") + item) + "\n";
        counter++;
    }
    java.lang.System.out.print(result);
    return result;
}