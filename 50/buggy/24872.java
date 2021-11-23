public boolean checkEmail(java.lang.String email) {
    for (com.codecool.sherwoodbet.Model.User user : userRepository.findAll()) {
        if ((user.getEmail()) == email) {
            return false;
        }
    }
    return true;
}