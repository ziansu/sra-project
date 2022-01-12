@java.lang.Override
public void handleData(java.net.URI uri, java.lang.String data) {
    labelContext.data = data;
    updateLabelText(labelContext.label, data, labelContext.converter);
}