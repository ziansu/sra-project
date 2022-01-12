public java.lang.String toString() {
    java.lang.String s = (getValueIsAdjusting() ? "~" : "=") + (value.toString());
    return ((((getClass().getName()) + " ") + (java.lang.Integer.toString(hashCode()))) + " ") + s;
}