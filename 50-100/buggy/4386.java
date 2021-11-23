public void save() {
    if (driverService.hasBeenPersisted(driver)) {
        driverService.update(driver);
        web.core.helpers.FrontendHelper.displaySuccessSmallBox("De bestuurder is geupdate");
    }else {
        driver = driverService.create(driver);
        try {
            main.core.communcation.Communicator.addDriver(driver);
        } catch (java.io.IOException | org.codehaus.jettison.json.JSONException e) {
            e.printStackTrace();
        }
        web.core.helpers.FrontendHelper.displaySuccessSmallBox("De bestuurder is aangemaakt");
    }
    web.core.helpers.RedirectHelper.redirect("/pages/driver/driverOverview.xhtml");
}