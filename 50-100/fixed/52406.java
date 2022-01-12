public static br.edu.ufcg.computacao.si1.model.usuario.Usuario create(br.edu.ufcg.computacao.si1.model.form.UsuarioForm form) {
    br.edu.ufcg.computacao.si1.model.usuario.Usuario user = null;
    switch (form.getRole()) {
        case 1 :
            user = new br.edu.ufcg.computacao.si1.model.usuario.UsuarioPessoa(form.getNome(), form.getEmail(), form.getSenha());
            break;
        case 2 :
            user = new br.edu.ufcg.computacao.si1.model.usuario.UsuarioEmpresa(form.getNome(), form.getEmail(), form.getSenha());
            break;
    }
    return user;
}