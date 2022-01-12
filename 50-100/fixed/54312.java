public void updateUser(com.example.calebrudnicki.spoutr.User user, java.lang.String password) {
    for (com.example.calebrudnicki.spoutr.User u : com.example.calebrudnicki.spoutr.Model.allUsers) {
        if (u.getUsername().equals(user.getUsername())) {
            com.example.calebrudnicki.spoutr.Model.allUsers.remove(u);
            user.setPassword(password);
            com.example.calebrudnicki.spoutr.Model.allUsers.add(user);
            return ;
        }
    }
}