private boolean checkIfSponsor(java.lang.String a) {
    java.lang.String author = a.toLowerCase();
    return (author.contains("ibsa")) || (author.contains("desitin"));
}