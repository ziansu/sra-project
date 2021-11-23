public void createChildItem(Model.Child child) {
    javax.swing.Icon picture = new javax.swing.ImageIcon(getClass().getResource(("/image/child" + (child.getPicture()))));
    javax.swing.JButton childBtn = new javax.swing.JButton(picture);
    childBtn.addMouseListener(new Controler.ChildLoginSelection(child, this.layout));
    childLogin.add(childBtn);
}