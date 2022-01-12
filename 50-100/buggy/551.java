@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(language);
    if ((country) != null) {
        sb.append("-").append(country);
    }
    if ((variant) != null) {
        sb.append("-").append(variant);
    }
    return sb.toString();
}