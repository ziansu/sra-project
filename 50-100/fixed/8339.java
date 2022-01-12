private void addContents() {
    for (com.ihasama.ohtu.domain.Reference ref : dao.getObjects()) {
        javax.swing.JLabel label = new javax.swing.JLabel(ref.getId());
        add(label);
        add(new javax.swing.JButton(new com.ihasama.ohtu.ui.ReferenceList.EditReferenceAction("edit", dao, ref)), "wrap");
    }
}