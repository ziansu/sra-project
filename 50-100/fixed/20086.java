@play.mvc.Before
static void intiIHM() {
    models.UiObject uiObject;
    uiObject = ((models.UiObject) (play.cache.Cache.get("uiobject")));
    if (uiObject == null) {
        uiObject = new models.UiObject();
        uiObject.tags = services.DataLayer.getAllTags();
        uiObject.categories = services.DataLayer.getAllCategories();
        play.cache.Cache.add("uiobject", uiObject);
    }
    renderArgs.put("uiObject", uiObject);
}