@java.lang.Override
public java.lang.String toString(java.lang.String value) {
    return ("'" + (value.replace("'", "\\\'"))) + "'";
}