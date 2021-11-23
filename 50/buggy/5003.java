public void remove(java.lang.String name) {
    org.mingy.lunjian.Trigger trigger = triggers.remove(name);
    trigger.cleanup();
    if (trigger != null) {
        java.lang.System.out.println((("trigger " + name) + " removed"));
    }
}