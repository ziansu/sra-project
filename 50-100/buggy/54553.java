private void registerEntities() {
    cc.ntechnologies.Bootstrap.log.info("Registering entities...");
    com.googlecode.objectify.ObjectifyService.register(cc.ntechnologies.Conference.class);
    com.googlecode.objectify.ObjectifyService.register(cc.ntechnologies.News.class);
    com.googlecode.objectify.ObjectifyService.register(cc.ntechnologies.Organizer.class);
    com.googlecode.objectify.ObjectifyService.register(cc.ntechnologies.Partner.class);
    com.googlecode.objectify.ObjectifyService.register(cc.ntechnologies.Room.class);
    com.googlecode.objectify.ObjectifyService.register(cc.ntechnologies.Speaker.class);
    com.googlecode.objectify.ObjectifyService.register(cc.ntechnologies.User.class);
    cc.ntechnologies.Bootstrap.log.info("Done registering entities.");
}