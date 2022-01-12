@play.mvc.BodyParser.Of(value = play.libs.Json.class)
public play.mvc.Result update(java.lang.Long id) {
    models.persistent.MachineNode input = play.libs.Json.fromJson(request().body().asJson(), models.persistent.MachineNode.class);
    if ((MachineNode.find.byId(input.getId())) == null) {
        return notFound();
    }
    input.update();
    return ok();
}