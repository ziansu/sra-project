public static void main(java.lang.String[] args) throws java.lang.IllegalArgumentException {
    try {
        new lab2.InputOutputGui().startConversation();
    } catch (java.lang.IllegalArgumentException iae) {
        new lab2.InputOutputGui().displayGui(("Error! Your full name was not entered in properly. It must contain" + " both a first and last name."));
    }
}