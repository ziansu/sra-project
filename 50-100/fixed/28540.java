public cc.blynk.server.core.model.widgets.Target getDeviceIdsByTarget(int targetId) {
    cc.blynk.server.core.model.device.Device device = getDeviceById(targetId);
    if (device != null) {
        return device;
    }
    cc.blynk.server.core.model.device.Tag tag = getTagById(targetId);
    if (tag != null) {
        return tag;
    }
    cc.blynk.server.core.model.widgets.Widget widget = getWidgetById(targetId);
    if ((widget != null) && (widget instanceof cc.blynk.server.core.model.widgets.Target)) {
        return ((cc.blynk.server.core.model.widgets.Target) (widget));
    }
    return null;
}