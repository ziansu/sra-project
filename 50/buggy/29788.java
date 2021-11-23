public javafx.collections.ObservableList pt10r(javafx.collections.ObservableList list1, javafx.collections.ObservableList list2) {
    java.util.Set<model.Employee> temp = new java.util.HashSet<>();
    return pt10r(list1, list2, 0, 0, temp);
}