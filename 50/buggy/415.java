public static com.xenione.libs.swipemaker.Anchors make(java.lang.Integer[] anchors) {
    if ((anchors.length) < 2) {
        throw new java.lang.IllegalArgumentException("Amount of anchor points provided to SwipeLayout have to be bigger than 2");
    }
    java.util.Arrays.sort(anchors);
    return new com.xenione.libs.swipemaker.Anchors(new com.xenione.libs.swipemaker.Anchors.Anchor(anchors));
}