private int addNumber() {
    java.lang.System.out.print("Enter contact phone number: ");
    int tel;
    while (true) {
        tel = validateNumber();
        Contact contact = getbyNumber(tel);
        if ((contact.getNumber()) == tel) {
            java.lang.System.out.println((("That number already exists for contact " + (contact.getName())) + ". Try a different one"));
            continue;
        }else
            if (contact == null) {
                java.lang.System.out.println("Adding new number...");
            }
        
        break;
    } 
    return tel;
}