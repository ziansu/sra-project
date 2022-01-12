@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (!(obj instanceof gov.gtas.model.Document))
        return false;
    
    final gov.gtas.model.Document other = ((gov.gtas.model.Document) (obj));
    return java.util.Objects.equals(this.documentNumber, other.documentNumber);
}