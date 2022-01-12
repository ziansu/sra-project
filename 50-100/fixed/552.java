@java.lang.Override
public int compare(java.util.Map<java.lang.String, java.lang.Object> o1, java.util.Map<java.lang.String, java.lang.Object> o2) {
    java.lang.Long s1 = ((java.lang.Long) (o1.get("score")));
    java.lang.Long s2 = ((java.lang.Long) (o2.get("score")));
    return ((int) (s2 - s1));
}