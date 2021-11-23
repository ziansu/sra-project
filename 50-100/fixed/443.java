public static boolean isFavourite(java.lang.String userId, java.lang.String resourceId, java.lang.String resourceType) {
    boolean found = false;
    org.jongo.MongoCollection favourites = controllers.MongoDBController.getCollection(CollectionNames.favourites);
    models.Favourite fav = favourites.findOne("{userId:#, resourceId:#, resourceType:#}", userId, resourceId, resourceType).as(models.Favourite.class);
    if (fav != null) {
        if (fav.isActive) {
            found = true;
        }
    }
    return found;
}