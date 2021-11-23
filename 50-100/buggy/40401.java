public java.lang.String toString() {
    java.lang.String string = "";
    if ((variable) != null) {
        if ((variable.getEquivalentValue().size()) == 1) {
            string += variable.getEquivalentValue().get(0);
        }
    }else {
        string += getParentVariableName();
        if (this.doubleAccess)
            string += "." + (getAttributeName());
        
    }
    return string;
}