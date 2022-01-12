public void setSimilarMushroomID(java.lang.String similarMusrooms) {
    SimilarMushroomID = new java.util.ArrayList<>();
    java.lang.String[] stringIDs = similarMusrooms.trim().split(",");
    for (java.lang.String s : stringIDs) {
        if (s != "") {
            SimilarMushroomID.add(java.lang.Integer.parseInt(s));
        }
    }
}