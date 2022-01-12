public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (cancel))
        this.dispose();
    else {
        view.createNewBracket(name.getText(), number.getText(), size.getText());
        this.dispose();
    }
}