public void destroy() {
    gr.entij.EntityEvent destroyEvent = new gr.entij.EntityEvent(this, gr.entij.event.EntityEvent.Type.DESTROYED);
    entityListeners = gr.entij.Entity.fireEvent(entityListeners, destroyEvent);
}