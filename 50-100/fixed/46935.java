@play.mvc.Security.Authenticated(value = controllers.Authenticator.class)
public play.mvc.Result index() {
    java.util.List<models.persistent.ShopFloor> shopFloors = ShopFloor.find.where().eq(ShopFloor.OWNER, user()).findList();
    models.persistent.ShopFloor sf;
    if (shopFloors.isEmpty()) {
        sf = new models.persistent.ShopFloor();
        sf.setOwner(user());
        sf.save();
    }else {
        sf = shopFloors.get(0);
    }
    return ok(play.libs.Json.toJson(sf));
}