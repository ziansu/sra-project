public static java.util.Set<models.Consent> getAllByAuthorized(org.bson.types.ObjectId member) throws utils.exceptions.InternalServerException {
    return models.Model.getAll(models.Consent.class, models.Consent.collection, utils.collections.CMaps.map("authorized", member), utils.collections.Sets.create("name", "order", "owner"));
}