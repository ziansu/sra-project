@java.lang.Override
public java.lang.String getQueryValue() {
    return ("'" + (get().replace("'", "''"))) + "'";
}