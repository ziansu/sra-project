@play.mvc.Security.Authenticated(value = controllers.Authenticator.class)
public play.mvc.Result index() {
    java.util.List<models.persistent.ShopFloor> shopFloors = ShopFloor.find.where().eq(ShopFloor.OWNER, user()).findList();
    if (shopFloors.isEmpty()) {
        models.persistent.ShopFloor sf = new models.persistent.ShopFloor();
        sf.setOwner(user());
        sf.save();
    }
    return ok(play.libs.Json.toJson(shopFloors.get(0)));
}