public java.lang.String toString() {
    java.lang.String string = "";
    if ((variable) != null) {
        if ((variable.getEquivalentValue().size()) == 1) {
            string += variable.getEquivalentValue().get(0);
        }
        if (this.doubleAccess)
            string += "." + (getAttributeName());
        
    }else {
        string += getParentVariableName();
        if (this.doubleAccess)
            string += "." + (getAttributeName());
        
    }
    return string;
}