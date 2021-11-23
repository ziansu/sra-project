@java.lang.Override
public void onCreate() {
    super.onCreate();
    if ((org.gemini.init.ExecService.instance) == (this)) {
        logger = new org.gemini.init.Logger(this, "service.log");
        org.gemini.init.Receiver.register(this);
    }
}