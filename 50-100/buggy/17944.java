public final org.alicebot.ab.Nodemapper match(java.lang.String input, java.lang.String that, java.lang.String topic) {
    org.alicebot.ab.Nodemapper n = brain.match2(input, that, topic);
    if (n != null) {
        lastUtteranceId = java.lang.Integer.parseInt(n.category.getFilename());
    }
    return n;
}