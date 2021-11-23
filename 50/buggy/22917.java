private void onAddRemove(gr.entij.Entity ent, gr.entij.EntityEvent.Type type) {
    fireEvent(addRemoveListeners, new gr.entij.EntityEvent(ent, type));
}