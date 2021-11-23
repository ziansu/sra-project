public void setPassword(java.lang.String password) {
    if ((person.getId()) == null) {
        person.setPassword(password);
    }else
        if ((!(password.equals(person.getPassword()))) && (!(password.isEmpty()))) {
            changedPassword = true;
            person.setPassword(password);
        }
    
}