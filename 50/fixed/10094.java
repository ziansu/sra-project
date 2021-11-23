@java.lang.Override
public int compareTo(org.fyrz.solr.explain.model.FieldMatch o) {
    if (equals(o)) {
        return 0;
    }
    return getScore().compareTo(o.getScore());
}