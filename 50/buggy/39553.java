@java.lang.Override
public void handleData(java.net.URI uri, java.lang.String data) {
    updateLabelText(labelContext.label, data, labelContext.converter);
}