@java.lang.Override
public void onGnosEventFired(com.org.gnos.events.GnosEvent e) {
    if ((e.eventName) == "homeTab:new-project-created") {
        com.org.gnos.events.GnosEventWithAttributeMap event = ((com.org.gnos.events.GnosEventWithAttributeMap) (e));
        openPitControlsTab(event);
    }else
        if ((e.eventName) == "createNewProjectScreen:upload-records-complete") {
            java.lang.System.out.println("New project event fired");
            com.org.gnos.events.GnosEventWithAttributeMap event = ((com.org.gnos.events.GnosEventWithAttributeMap) (e));
            openPitControlsTab(event);
        }
    
}