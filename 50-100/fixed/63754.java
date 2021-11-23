@javafx.fxml.FXML
private void handleBtnAddPersonClicked(javafx.scene.input.MouseEvent event) {
    populatelist.Person newPerson = new populatelist.Person();
    newPerson.setFirstName(tfFirstName.getText());
    newPerson.setLastName(tfLastName.getText());
    javax.persistence.EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("PopulateListPU");
    populatelist.PersonJpaController jpaPerson = new populatelist.PersonJpaController(emf);
    try {
        jpaPerson.create(newPerson);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(ex.toString());
    }
}