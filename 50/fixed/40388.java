@java.lang.Override
protected void processMouseEvent(java.awt.event.MouseEvent me) {
    super.processMouseEvent(me);
    switch (me.getID()) {
        case java.awt.event.MouseEvent.MOUSE_CLICKED :
            toggleElementEditor();
            de.dfki.vsm.editor.event.ElementEditorToggledEvent ev = new de.dfki.vsm.editor.event.ElementEditorToggledEvent(this);
            mEventCaster.convey(ev);
    }
}