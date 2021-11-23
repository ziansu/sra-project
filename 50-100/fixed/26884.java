@play.db.jpa.Transactional
public static play.mvc.Result update(java.lang.String profileId) {
    models.GoogleAnalyticsProfile object = play.libs.Json.fromJson(request().body().asJson(), models.GoogleAnalyticsProfile.class);
    return controllers.settings.GoogleAnalyticsSettings.commonAction(object, new play.libs.F.Callback0() {
        @java.lang.Override
        public void invoke() throws java.lang.Throwable {
            models.dao.GoogleAnalyticsProfileDAO.update(object);
        }
    });
}