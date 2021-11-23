@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(language);
    if ((country.length()) > 0) {
        sb.append("-").append(country);
    }
    if ((variant.length()) > 0) {
        sb.append("-").append(variant);
    }
    return sb.toString();
}