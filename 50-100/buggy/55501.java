@java.lang.Override
public void onSuccess(java.lang.String result) {
    org.roda.wui.common.client.widgets.Toast.showInfo(org.roda.wui.client.ingest.transfer.IngestTransfer.messages.dialogSuccess(), org.roda.wui.client.ingest.transfer.IngestTransfer.messages.moveSIPSuccessful());
    if (resource.isFile()) {
        org.roda.wui.common.client.tools.Tools.newHistory(org.roda.wui.client.ingest.transfer.IngestTransfer.RESOLVER, result);
    }else {
        transferredResourceList.refresh();
    }
}