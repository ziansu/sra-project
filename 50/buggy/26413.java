@java.lang.Override
public void setText(java.util.List<java.lang.String> text) {
    currentDocument.setText(text);
    org.greenrobot.eventbus.EventBus.getDefault().post(new edu.chl.proton.event.TextUpdateEvent("Hello everyone!"));
}