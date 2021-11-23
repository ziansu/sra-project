public boolean containsActor(model.Event event, java.lang.String actor) {
    return ((event.getProperty("actors")) != null) && (event.getProperty("actors").contains(actor));
}