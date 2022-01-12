public static void releaseLock() {
    if ((application.Locker.state) != (application.Locker.State.hold)) {
        java.lang.System.out.println("Not in CS");
        return ;
    }
    application.Log.verbose("Locker", ("sending release to all in group " + (application.Locker.myGroup)));
    application.Locker.state = application.Locker.State.release;
    application.Locker.multiCaster.R_MultiCast(application.Locker.myGroup, new message.Message(null, "release", "release"));
}