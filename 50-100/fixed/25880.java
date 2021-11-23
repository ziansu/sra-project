private void checkIfValidUser(com.hazardmanager.users.models.User user) {
    user.validateFirstName(user.getFirstName());
    user.validateLastName(user.getLastName());
    user.validateUserName(user.getUserName());
    user.validateEmail(user.getEmail());
    user.validatePhoneNumber(user.getPhoneNumber());
}