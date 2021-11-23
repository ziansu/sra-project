@java.lang.Override
public void onChage() {
    headersData = headersCodeMirror.getValue();
    headersRawInput.setValue(headersData);
    org.rest.client.log.Log.info(("Code mirror change fired actually now::" + (headersData)));
}