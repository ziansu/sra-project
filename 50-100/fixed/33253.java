public org.lateralgm.subframes.CodeFrame openInstanceCodeFrame(int id, boolean select) {
    org.lateralgm.resources.sub.Instance inst = findInstance(id, select);
    if (inst != null) {
        return openCodeFrame(inst, org.lateralgm.messages.Messages.getString("RoomFrame.TITLE_FORMAT_CREATION"), org.lateralgm.messages.Messages.format("RoomFrame.INSTANCE", ((java.lang.Integer) (inst.properties.get(PInstance.ID)))));
    }
    return null;
}