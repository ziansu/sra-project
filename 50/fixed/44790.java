public models.Oeuvre getOeuvre() {
    return utils.MongoAccess.request("oeuvre", oeuvre_id).as(models.Oeuvre.class);
}