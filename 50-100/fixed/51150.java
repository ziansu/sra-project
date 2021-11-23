@java.lang.Override
public java.lang.String toString() {
    java.lang.String formatted = super.toString();
    for (int i = 0; i < (entries.length); i++) {
        formatted += (entries[i]) + ",";
    }
    return formatted.substring(0, ((formatted.length()) - 1));
}