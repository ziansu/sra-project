public void backward() throws java.io.IOException {
    clear();
    java.lang.String uri = "cadastrar_especialista.xhtml";
    javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().dispatch(uri);
}