@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    listModel.clear();
    previousContext = previousContext.getParent();
    for (Node<Post> np : previousContext.getChildren()) {
        listModel.addElement(np);
    }
}