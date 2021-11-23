public static <T> void deferredDeleteEntity(T t) {
    com.googlecode.objectify.ObjectifyService.ofy().defer().delete().entity(t);
}