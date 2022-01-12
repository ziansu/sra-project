public void push(java.lang.String s) {
    Homework4.Node temp = new Homework4.Node(s, null);
    if (this.isEmpty()) {
        this.top = temp;
    }else {
        temp.setNext(this.top);
        this.top = temp;
    }
}