public static net.michaelho.db.mongo.Query addToSet(net.michaelho.db.mongo.Query query) {
    return new net.michaelho.db.mongo.Query("$addToSet", query);
}