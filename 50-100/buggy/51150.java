@java.lang.Override
public java.lang.String toString() {
    java.lang.String formatted = "";
    for (int i = 0; i < (size); i++) {
        formatted += (entries[i]) + ",";
    }
    return formatted.substring(0, ((formatted.length()) - 1));
}