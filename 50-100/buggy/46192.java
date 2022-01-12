@java.lang.Override
public void dragStart(org.eclipse.swt.dnd.DragSourceEvent dragsourceevent) {
    super.dragStart(dragsourceevent);
    final java.lang.Object target = this.getTargetModel(dragsourceevent);
    if (target != null) {
        final org.eclipse.gef.dnd.TemplateTransfer transfer = ((org.eclipse.gef.dnd.TemplateTransfer) (this.getTransfer()));
        transfer.setObject(target);
    }else {
        dragsourceevent.doit = false;
    }
}