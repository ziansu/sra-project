@java.lang.Override
public void dragSetData(org.eclipse.swt.dnd.DragSourceEvent event) {
    event.data = this.getTargetModel(event);
}