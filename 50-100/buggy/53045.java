private void setFlagAtIndex(java.util.List<com.columbasms.columbasms.model.Contact> l, com.columbasms.columbasms.model.Contact c) {
    for (int i = 0; i < (l.size()); i++) {
        if (l.get(i).getContact_number().equals(c.getContact_number())) {
            l.get(i).setSelected(c.isSelected());
        }
    }
}