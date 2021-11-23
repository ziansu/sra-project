@org.junit.Test
public void changeDePhonebookDAOPassandoUmContatoNulo() {
    try {
        assertFalse(phonebookDAO.change(contact.getNome(), contact, null));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}