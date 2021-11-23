@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    for (int j = 0; j < (items.size()); ++j) {
        if ((ae.getSource()) == (items.get(j))) {
            men.setText(items.get(j).getText());
            men.setName(items.get(j).getName());
        }
    }
}