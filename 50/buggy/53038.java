@java.lang.Override
public java.lang.String getAsString(javax.faces.context.FacesContext arg0, javax.faces.component.UIComponent arg1, java.lang.Object moedaObjeto) {
    if (moedaObjeto != null) {
        br.com.arvore_societaria_jsf.bean.Moeda moeda = ((br.com.arvore_societaria_jsf.bean.Moeda) (moedaObjeto));
        return moeda.getId().toString();
    }
    return null;
}