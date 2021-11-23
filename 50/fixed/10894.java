public static boolean createFirstInspector() {
    if (!(org.micromanager.display.internal.inspector.InspectorFrame.haveCreatedInspector_)) {
        new org.micromanager.display.internal.inspector.InspectorFrame(null);
        return true;
    }
    return false;
}