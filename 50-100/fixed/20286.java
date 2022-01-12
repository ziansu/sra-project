public ninja.Result getSystemOwner(ninja.Context context, ninja.session.FlashScope flashScope) {
    ai.subut.kurjun.model.identity.User user = identityManagerService.getSystemOwner();
    if (user != null) {
        ai.subut.kurjun.web.controllers.IdentityController.LOGGER.info("owner found");
        return ninja.Results.html().template("views/_popup-view-system-owner.ftl").render("sys_owner", user);
    }else {
        ai.subut.kurjun.web.controllers.IdentityController.LOGGER.info("ownwer NOT found");
        return ninja.Results.html().template("views/_popup-view-system-owner.ftl").render("sys_owner", user);
    }
}