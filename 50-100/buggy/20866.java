public <T> java.lang.String displayItemsAsMenuOptions(java.util.List<T> items) {
    java.lang.System.out.println("Choose an option by typing the corresponding number:");
    java.lang.String result = "";
    for (T item : items) {
        int optionNumber = (items.indexOf(item)) + 1;
        result += ((optionNumber + ". ") + item) + "\n";
    }
    java.lang.System.out.print(result);
    return result;
}