public void remove(java.lang.String name) {
    org.mingy.lunjian.Trigger trigger = triggers.remove(name);
    if (trigger != null) {
        trigger.cleanup();
        java.lang.System.out.println((("trigger " + name) + " removed"));
    }
}