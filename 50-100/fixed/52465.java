public void actionPerformed(java.awt.event.ActionEvent e) {
    for (int i = 0; i < 10; i++) {
        if (((e.getSource()) == (button[i])) && (!(button[i].getText().trim().equals("")))) {
            setPopup(button[i]);
        }
    }
}