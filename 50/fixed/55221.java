com.mycompany.app.Node successor() {
    com.mycompany.app.Node current = right;
    while ((current != null) && ((current.left) != null)) {
        current = current.left;
    } 
    return current;
}