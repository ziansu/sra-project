@java.lang.Override
public java.lang.String getValue() {
    java.util.List<org.roda.core.data.v2.TransferredResource> items = display.getVisibleItems();
    if ((items.size()) == 0) {
        return "";
    }else {
        long totalSize = 0;
        for (org.roda.core.data.v2.TransferredResource item : items) {
            totalSize += item.getSize();
        }
        return totalSize > 0 ? org.roda.wui.common.client.tools.Humanize.readableFileSize(totalSize) : "";
    }
}