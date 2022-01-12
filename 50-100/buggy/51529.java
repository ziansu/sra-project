public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.Object selected = attribList.getSelectedValue();
    java.lang.System.out.println(java.lang.String.valueOf(selected));
    if ((java.lang.String.valueOf(selected)) != "null") {
        copyModel.addElement(selected);
        model.removeElement(selected);
    }
}