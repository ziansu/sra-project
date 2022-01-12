@java.lang.Override
public java.lang.Object getAsObject(javax.faces.context.FacesContext context, javax.faces.component.UIComponent component, java.lang.String submittedValue) {
    javax.el.ELContext elContext = javax.faces.context.FacesContext.getCurrentInstance().getELContext();
    br.com.fiap.tsis.bookstore.controller.AtualizarController atualizarController = ((br.com.fiap.tsis.bookstore.controller.AtualizarController) (javax.faces.context.FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "atualizarController")));
    for (br.com.fiap.tsis.bookstore.model.to.Categoria categoria : atualizarController.getCategorias()) {
        if (categoria.getId().equals(java.lang.Integer.parseInt(submittedValue))) {
            return categoria;
        }
    }
    return null;
}