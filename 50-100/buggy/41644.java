public static void hasSetFavorite(@play.data.validation.Required
@javax.validation.Valid
long itemId) {
    models.User user = renderArgs.get(Secure.FIELD_USER, models.User.class);
    if ((models.Favorite.findById(itemId, user.id)) > 0) {
        renderSuccessJson();
    }
    renderFailedJson(ReturnCode.FAIL);
}