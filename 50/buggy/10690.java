@java.lang.Override
public java.lang.String convertResultToString(java.lang.Object resultValue) {
    com.example.tzadmin.nfc_reader_writer.Models.User u = ((com.example.tzadmin.nfc_reader_writer.Models.User) (resultValue));
    java.lang.String str = ((((u.cFirstName) + " ") + (u.cLastName)) + " ") + (u.cSurname);
    return str;
}