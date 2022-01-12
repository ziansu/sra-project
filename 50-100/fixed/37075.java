public Homework4.Node dequeue() {
    if (this.isEmpty()) {
        return null;
    }else {
        java.lang.System.out.println(("dequeue -> " + (top)));
        Homework4.Node temp = top;
        this.top = top.getNext();
        return temp;
    }
}