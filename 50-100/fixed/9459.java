public void actionPerformed(java.awt.event.ActionEvent e) {
    comboText = ((java.lang.String) (Demo.getSelectedItem()));
    DemoInt = Demo.getSelectedIndex();
    if (!(Demo.getSelectedItem().equals("No Selection"))) {
        filePath.setText(((java.lang.String) (Demo.getSelectedItem())));
        addSelectedImg(Demo.getSelectedIndex());
    }else
        filePath.setText("No Item Selected");
    
}