@play.mvc.BodyParser.Of(value = play.libs.Json.class)
public play.mvc.Result create() {
    models.persistent.MachineNode input = play.libs.Json.fromJson(request().body().asJson(), models.persistent.MachineNode.class);
    if ((input.getId()) != 0) {
        return status(Http.Status.CONFLICT);
    }
    input.save();
    return ok(java.lang.String.valueOf(input.getId()));
}