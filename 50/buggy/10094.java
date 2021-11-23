@java.lang.Override
public int compareTo(org.fyrz.solr.explain.model.FieldMatch o) {
    return getScore().compareTo(o.getScore());
}