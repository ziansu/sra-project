public void setPassword(java.lang.String password) {
    if ((!(password.equals(person.getPassword()))) && (!(password.isEmpty()))) {
        changedPassword = true;
        person.setPassword(password);
    }
}