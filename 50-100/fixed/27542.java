public java.util.ArrayList<java.lang.String> checkContactNoRequirements(java.lang.String contactNo) {
    java.util.ArrayList<java.lang.String> messages = new java.util.ArrayList<java.lang.String>();
    if (!(contactNo.matches("[689][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))) {
        messages.add("Contact Number is not valid.");
    }
    return messages;
}