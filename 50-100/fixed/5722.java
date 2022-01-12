public void onStart(Application app) {
    Logger.info("Application has started");
    BootstrapDB.init();
    system = play.api.libs.concurrent.Akka.system(app.getWrappedApplication());
    userCleanUpActor = system.actorOf(UserCleanupActor.props);
    system.scheduler().schedule(scala.concurrent.duration.Duration.create(1, java.util.concurrent.TimeUnit.DAYS), scala.concurrent.duration.Duration.create(1, java.util.concurrent.TimeUnit.DAYS), userCleanUpActor, "tick", system.dispatcher(), null);
}