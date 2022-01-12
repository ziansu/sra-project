@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o instanceof SEO.TextPair) {
        SEO.TextPair tp = ((SEO.TextPair) (o));
        return (first.equals(tp.getFirst())) && (second.equals(tp.getSecond()));
    }
    return false;
}