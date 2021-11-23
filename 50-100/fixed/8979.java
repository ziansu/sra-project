public void getMiddle() {
    int middle = (size) / 2;
    if (((size) % 2) != 0)
        middle = middle + 1;
    
    if ((isEmpty()) == false) {
        Node temp = head;
        int i = 1;
        while (i != middle) {
            temp = temp.getNext();
            i = i + 1;
        } 
        java.lang.System.out.println(temp.getNext().getData());
    }else {
        java.lang.System.out.println("No data exist");
    }
}