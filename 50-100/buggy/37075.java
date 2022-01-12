public Homework4.Node dequeue() {
    if (this.isEmpty()) {
        return null;
    }else {
        java.lang.System.out.println(("dequeue -> " + (top)));
        this.top = this.top.getNext();
        return this.top;
    }
}