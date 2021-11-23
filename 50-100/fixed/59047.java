public com.flytxt.parser.marker.Marker create(final int lastIndex, final int i) {
    com.flytxt.parser.marker.Marker m = null;
    try {
        m = home.pop();
        (reused)++;
    } catch (final java.lang.Exception e) {
        m = new com.flytxt.parser.marker.Marker();
        (created)++;
    }
    m.index = lastIndex;
    m.length = i;
    roam.push(m);
    return m;
}