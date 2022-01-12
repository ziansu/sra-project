public void setSimilarMushroomID(java.lang.String similarMusrooms) {
    java.lang.String[] stringIDs = similarMusrooms.trim().split(",");
    for (java.lang.String s : stringIDs) {
        if (s != "") {
            SimilarMushroomID.add(java.lang.Integer.parseInt(s));
        }
    }
}