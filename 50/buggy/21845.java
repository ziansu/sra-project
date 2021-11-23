public static edu.illinois.cs427.mp4.Collection restoreCollection(java.lang.String stringRepresentation) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    edu.illinois.cs427.mp4.Collection coll = gson.fromJson(stringRepresentation, edu.illinois.cs427.mp4.Collection.class);
    return coll;
}