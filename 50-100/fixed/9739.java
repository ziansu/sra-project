@java.lang.Override
public int compareTo(de.uniks.template.TemplateFragment other) {
    if ((other.getKey()) == (key)) {
        if (other.getValue().equals(value)) {
            return 0;
        }
        return -1;
    }
    if ((other.getKey()) > (key)) {
        return -1;
    }
    return 1;
}