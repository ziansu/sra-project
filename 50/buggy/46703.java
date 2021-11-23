public void addProduit(org.bson.types.ObjectId id) {
    models.Produit p_ = utils.MongoAccess.request("produit", id).as(models.Produit.class).next();
    this.addProduit(p_);
}