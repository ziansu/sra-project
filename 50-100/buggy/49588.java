public static play.mvc.Result renderImage(java.lang.String rollId) throws java.sql.SQLException {
    play.db.ebean.Model.Finder f = new play.db.ebean.Model.Finder(java.lang.String.class, models.Roll.class);
    models.Roll roll = ((models.Roll) (f.ref(rollId)));
    java.lang.System.out.println(roll);
    return ok(roll.image).as("image/jpg");
}