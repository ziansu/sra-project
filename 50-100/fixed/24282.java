@java.lang.Override
public void handleEvent(cn.liutils.cgui.gui.Widget w, cn.liutils.cgui.gui.component.VerticalDragBar.DraggedEvent event) {
    double p = bar.getProgress(w);
    if ((hList) != null) {
        cn.liutils.cgui.gui.component.ElementList list = cn.liutils.cgui.gui.component.ElementList.get(hList);
        list.setProgress(hList, ((int) (java.lang.Math.round((p * (list.getMaxProgress()))))));
    }
}