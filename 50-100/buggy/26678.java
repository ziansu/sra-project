public models.Fichier getFichierAffiche() {
    models.Fichier fichier = null;
    for (java.lang.String s : fichiers_id.keySet()) {
        if (utils.Normalize.normalizeDenormStringField(s).endsWith(".PR.1.JPG")) {
            fichier = utils.MongoAccess.request("fichier", new org.bson.types.ObjectId(fichiers_id.get(s))).as(models.Fichier.class).next();
        }
    }
    return fichier;
}