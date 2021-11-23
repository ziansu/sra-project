private static java.lang.String username(Classes.Funcionario user) {
    if ((user.getNome()) == null) {
        return user.getUsuario();
    }
    return user.getNome();
}