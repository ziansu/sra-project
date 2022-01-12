public models.Fichier getFichierAffiche() {
    java.lang.String fichier_id = null;
    models.Fichier fichier = null;
    for (java.util.Map<java.lang.String, java.lang.String> file : fichiers) {
        if (file.get("fichier_string").endsWith("_PR_1_JPG")) {
            fichier_id = file.get("fichier_id");
        }
    }
    if (fichier_id != null) {
        fichier = utils.Connexion.getConnetion().request("fichier", new org.bson.types.ObjectId(fichier_id)).as(models.Fichier.class);
    }
    return fichier;
}