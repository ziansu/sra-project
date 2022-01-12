private void createNewUser(java.lang.String theUserName) {
    java.lang.System.out.println("Username is available!");
    java.lang.System.out.print("Enter your First Name: ");
    java.lang.String firstName = view.SystemHelper.promptUserString();
    java.lang.System.out.print("Enter your Last Name: ");
    java.lang.String lastName = view.SystemHelper.promptUserString();
    int id = myUserList.size();
    myUserList.add(new model.RegisteredUser(firstName, lastName, lastName, id));
}