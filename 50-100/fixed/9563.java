public java.lang.String getStringTodoList() {
    java.lang.String result = "\nItems to do: \n";
    int index = 1;
    for (TodoItem item : this.itemList) {
        result += java.lang.String.format("%d. ", index);
        if (item.getIsDone()) {
            result += "[x] ";
        }
        result += java.lang.String.format("%s%n", item.getName());
        index++;
    }
    return result;
}