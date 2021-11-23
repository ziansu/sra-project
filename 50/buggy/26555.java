private void creerEquipe(java.lang.String[] command) throws java.sql.SQLException {
    if ((command.length) == 4) {
        creerEquipe(command[1], command[2], command[3]);
    }
}