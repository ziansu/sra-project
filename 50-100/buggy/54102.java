public void display() {
    if ((head) == null) {
        java.lang.System.out.println("nothing");
    }else {
        LineEditor.ElementDPtr temp = head;
        while (temp != null)
            java.lang.System.out.println(temp.getValue());
        
        temp = temp.getNext();
    }
}