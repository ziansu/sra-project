public java.lang.String getClientId(javax.faces.context.FacesContext faces) {
    java.lang.String id = super.getClientId(faces);
    if ((this.index) >= 0) {
        id = this.getBuffer().append(id).append(getSeparatorChar(faces)).append(this.index).toString();
    }
    return id;
}