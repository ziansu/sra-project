@javafx.fxml.FXML
public void addContact() {
    com.test.contract.entity.Contact contact = new com.test.contract.entity.Contact(txtName.getText(), txtPhone.getText(), txtEmail.getText(), txtAge.getText());
    contactService.save(contact);
    data.add(contact);
    txtName.setText("");
    txtPhone.setText("");
    txtEmail.setText("");
}