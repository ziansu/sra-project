public java.util.ArrayList<models.Fichier> getFichiers() {
    java.util.ArrayList<models.Fichier> fichiers = new java.util.ArrayList<>();
    for (java.lang.String s : fichiers_id.keySet()) {
        fichiers.add(utils.MongoAccess.request("fichier", new org.bson.types.ObjectId(fichiers_id.get(s))).as(models.Fichier.class));
    }
    return fichiers;
}