@java.lang.Override
public void onDrop(com.google.appinventor.client.widgets.dnd.DragSource source, int x, int y, int offsetX, int offsetY) {
    com.google.appinventor.client.editor.simple.components.MockComponent component = ((com.google.appinventor.client.editor.simple.palette.SimplePaletteItem) (source)).createMockComponent();
    if (form.fireComponentEvent(com.google.appinventor.client.editor.youngandroid.events.CreateComponent.create(com.google.appinventor.client.Ode.getCurrentChannel(), component.getUuid(), component.getType()))) {
        com.google.appinventor.client.editor.simple.components.MockComponent sourceComponent = form.getComponentByUuid(component.getUuid());
        addComponent(sourceComponent);
        sourceComponent.select();
    }
}