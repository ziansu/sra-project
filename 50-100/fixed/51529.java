public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.Object selected = attribList.getSelectedValue();
    if ((java.lang.String.valueOf(selected)) != "null") {
        if (!(copyModel.contains(selected))) {
            copyModel.addElement(selected);
            model.removeElement(selected);
        }
    }
}