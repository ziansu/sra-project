private java.util.List<org.activityinfo.ui.client.component.form.field.attachment.AttachmentUploadRow> rowsFromPanel() {
    java.util.List<org.activityinfo.ui.client.component.form.field.attachment.AttachmentUploadRow> rows = com.google.common.collect.Lists.newArrayList();
    for (int i = 0; i < (rootPanel.getWidgetCount()); i++) {
        org.activityinfo.ui.client.component.form.field.attachment.Widget widget = rootPanel.getWidget(i);
        if (widget instanceof org.activityinfo.ui.client.component.form.field.attachment.AttachmentUploadRow) {
            rows.add(((org.activityinfo.ui.client.component.form.field.attachment.AttachmentUploadRow) (widget)));
        }
    }
    return rows;
}