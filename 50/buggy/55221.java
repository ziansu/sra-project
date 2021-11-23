com.mycompany.app.Node successor() {
    com.mycompany.app.Node current = right;
    while (current != null) {
        current = current.left;
    } 
    return current;
}