@org.junit.Test
public void changeDePhonebookDAOPassandoUmPhonebookAleradoNulo() {
    try {
        assertFalse(phonebookDAO.change(contact.getNome(), null, contact));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}