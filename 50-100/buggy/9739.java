@java.lang.Override
public int compareTo(de.uniks.template.TemplateFragment other) {
    if (((other.getKey()) == (key)) && (other.getValue().equals(value))) {
        return 0;
    }
    if ((other.getKey()) > (key)) {
        return -1;
    }
    return 1;
}