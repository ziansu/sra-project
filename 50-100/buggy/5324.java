public java.lang.String salvar() {
    try {
        perdido.setDataCadastro(new java.util.Date());
        perdido = postEntity(perdido, "animal/perdido/salvar/", br.com.petshow.model.Perdido.class);
        exibirInforMessage("Seu PET foi anunciado com sucesso!");
    } catch (br.com.petshow.exceptions.ExceptionErroCallRest | br.com.petshow.exceptions.ExceptionValidation e) {
        exibirErroMessage(("Erro ao tentar salvar: " + (e.getMessage())));
    }
    return null;
}