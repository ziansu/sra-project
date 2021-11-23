public java.lang.String getAsString(javax.faces.context.FacesContext context, javax.faces.component.UIComponent component, java.lang.Object value) {
    if (value != null) {
        model.Lote lote = ((model.Lote) (value));
        java.lang.System.out.println(lote.toString());
        return java.lang.String.valueOf(((java.lang.Long) (lote.getId())));
    }else {
        return null;
    }
}