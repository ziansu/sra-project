public static void saveAll(java.util.Collection<ua.skillsup.java0.phonebook.model.ContactPhoneBook> contacts) {
    try {
        java.io.FileWriter writer = new java.io.FileWriter("contacts.txt", false);
        for (ua.skillsup.java0.phonebook.model.ContactPhoneBook contact : contacts) {
            writer.write(contact.toString());
            writer.write("\r\n");
        }
        writer.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}