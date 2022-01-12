public br.ufg.inf.pitanga.entidades.Cliente recuperarClientePorEmail(java.lang.String email) {
    if ((email == null) || ("".equals(email))) {
        throw new java.security.InvalidParameterException("email");
    }
    return clienteRepository.findByEmail(email);
}