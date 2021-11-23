public org.lemurproject.galago.utility.Parameters toJSON() {
    org.lemurproject.galago.utility.Parameters p = org.lemurproject.galago.utility.Parameters.create();
    p.put("sentenceId", sentenceId);
    p.put("tokenId", tokenId);
    p.put("terms", org.lemurproject.galago.utility.Parameters.wrap(terms));
    p.put("indicators", new java.util.ArrayList<>(indicators));
    return p;
}