public play.mvc.Result submit() {
    play.data.Form<models.UserProfile> filledForm = profileForm.bindFromRequest();
    models.UserProfile created = filledForm.get();
    java.lang.String id = session("id");
    java.lang.System.out.println(id);
    created.id = java.lang.Long.valueOf(id).longValue();
    created.name = session("name");
    created.save();
    return ok(createprofile.render(profileForm));
}