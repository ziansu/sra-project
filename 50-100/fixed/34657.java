public static void saveAll(java.util.Collection<ua.skillsup.java0.phonebook.model.ContactPhoneBook> contacts) throws java.io.IOException {
    java.io.FileWriter writer = null;
    try {
        writer = new java.io.FileWriter("contacts.txt", false);
        for (ua.skillsup.java0.phonebook.model.ContactPhoneBook contact : contacts) {
            writer.write(contact.toString());
            writer.write("\r\n");
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        writer.close();
    }
}