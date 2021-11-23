public void setEditableSlot(int slot) {
    ASSERT((slot >= 0));
    setSelected(new com.js.geometryapp.editor.SlotList(slot));
    get(slot).setEditable(true);
    mutate();
}