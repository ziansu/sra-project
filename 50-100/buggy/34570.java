@java.lang.Override
public java.lang.String toString() {
    if ((length) > 0) {
        if ((fieldName) != null) {
            return ((((((((name) + "[") + (fieldName)) + "]") + " size:") + (length)) + "byte") + " id:") + (id);
        }
        return (((name) + " size:") + (length)) + "byte";
    }
    return name;
}