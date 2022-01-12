public play.mvc.Result openProfile(java.lang.String key) {
    play.data.Form<controllers.Application.ProfileRegister> profileEntry = play.data.Form.form(controllers.Application.ProfileRegister.class).bindFromRequest();
    java.util.List<models.Service> services = Service.find.all();
    models.Profile profile = models.Profile.findByProfileKey(key);
    java.lang.String currentServices = profile.services;
    java.util.List<java.lang.String> selectedServices = new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(currentServices.split(",")));
    return ok(editprofile.render(profileEntry, services, profile, selectedServices));
}