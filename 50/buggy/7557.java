public void run() {
    long tst = java.lang.Long.parseLong(org.universAAL.context.che.Activator.getProperties().getProperty("RECYCLE.KEEP"));
    db.removeOldEvents(((java.lang.System.currentTimeMillis()) - tst));
}