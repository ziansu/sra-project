@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o instanceof SEO.TextPair) {
        SEO.TextPair tp = ((SEO.TextPair) (o));
        return (first.toString().equals(tp.getFirst().toString())) && (second.toString().equals(tp.getSecond().toString()));
    }
    return false;
}