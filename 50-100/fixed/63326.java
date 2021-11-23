public void forward() {
    if ((head) == null) {
        java.lang.System.out.println("The list is empty");
    }
    placeHolder = head;
    for (int i = 0; i < ((size) - 1); i++) {
        java.lang.System.out.println(placeHolder.getName());
        placeHolder = placeHolder.getNext();
    }
}