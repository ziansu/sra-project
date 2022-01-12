public java.lang.String getTechniquesUtilisees_noms_complets() {
    return getTechniquesUtilisees_id().entrySet().stream().map(( a) -> utils.MongoAccess.request("technique", new org.bson.types.ObjectId(a.getValue())).as(models.Technique.class).next().getNom_complet()).collect(java.util.stream.Collectors.joining(", "));
}