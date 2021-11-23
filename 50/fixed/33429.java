private java.lang.String getSequence(java.lang.String user) {
    java.lang.Integer round = gamers.get(user);
    java.lang.System.err.println(round);
    java.lang.System.err.println(sequence.toString(round));
    return sequence.toString(round);
}