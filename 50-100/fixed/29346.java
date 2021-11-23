public java.lang.String toString() {
    java.lang.String str = (getValueIsAdjusting() ? "~" : "=") + (value.toString());
    return ((((getClass().getName()) + " ") + (java.lang.Integer.toString(hashCode()))) + " ") + str;
}