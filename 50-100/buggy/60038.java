@java.lang.Override
public int compare(kreuzungsSimulation.Event e1, kreuzungsSimulation.Event e2) {
    if ((e1.getTime()) > (e2.getTime())) {
        return 1;
    }
    if ((e1.getTime()) < (e2.getTime())) {
        return -1;
    }
    if ((e1.getEventType()) == (kreuzungsSimulation.Event.EventType.AmpelSchalten)) {
        return -1;
    }else {
        return 0;
    }
}