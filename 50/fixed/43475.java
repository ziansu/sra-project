public boolean isStringValueEmpty() {
    java.lang.String toStringValue = this.toString();
    if (toStringValue.contains("=\"\""))
        return false;
    else
        return true;
    
}