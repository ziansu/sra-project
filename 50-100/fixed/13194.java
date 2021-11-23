@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof ar.edu.famaf.nlp.alusivo.GraphAlgorithm.Edge))
        return false;
    
    ar.edu.famaf.nlp.alusivo.GraphAlgorithm.Edge other = ((ar.edu.famaf.nlp.alusivo.GraphAlgorithm.Edge) (obj));
    if ((this.isRelation) != (other.isRelation))
        return false;
    
    if (!(this.uri.equals(other.uri)))
        return false;
    
    if (this.isRelation)
        return true;
    
    return this.value.equals(other.value);
}