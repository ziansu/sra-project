@java.lang.Override
public java.lang.String getAsString(javax.faces.context.FacesContext arg0, javax.faces.component.UIComponent arg1, java.lang.Object value) {
    if (value instanceof br.com.arvore_societaria_jsf.bean.Moeda) {
        br.com.arvore_societaria_jsf.bean.Moeda moeda = ((br.com.arvore_societaria_jsf.bean.Moeda) (value));
        return moeda.getId().toString();
    }
    return null;
}