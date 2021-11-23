public com.flytxt.parser.marker.Marker create(final int lastIndex, final int i) {
    com.flytxt.parser.marker.Marker m = null;
    try {
        m = home.pop();
        m.index = lastIndex;
        m.length = i;
        (reused)++;
    } catch (final java.lang.Exception e) {
        m = new com.flytxt.parser.marker.Marker();
        m.index = lastIndex;
        m.length = i;
        (created)++;
    }
    roam.push(m);
    return m;
}