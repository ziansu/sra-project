public void removeBudget() {
    java.lang.String title;
    int indexNumber;
    java.lang.System.out.println("Enter the Title to be removed");
    title = scanner.next();
    indexNumber = findId(title);
    if (indexNumber >= 0) {
        myArrayList.remove(indexNumber);
    }else {
        java.lang.System.out.println("Not found");
    }
}