@java.lang.SuppressWarnings(value = "unchecked")
private void displayMemberOnTable(business.LibraryMember member) {
    if (member != null) {
        libMemberData.clear();
        libMemberData.add(member);
        table.setItems(libMemberData);
        table.getColumns().clear();
        table.getColumns().addAll(firstNameColumn, lastNameColumn, telephoneColumn, addressColumn);
    }
}