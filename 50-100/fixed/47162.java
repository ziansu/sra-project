public static void requestLock() {
    if ((application.Locker.state) == (application.Locker.State.hold)) {
        java.lang.System.out.println("Currently in CS");
        return ;
    }
    application.Locker.state = application.Locker.State.want;
    application.Log.verbose("Locker", ("sending request to all in group " + (application.Locker.myGroup)));
    application.Locker.counter = 0;
    application.Locker.multiCaster.R_MultiCast(application.Locker.myGroup, new message.Message(null, "request", "request"));
}