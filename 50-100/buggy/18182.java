@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mCallback.onResourceSelected(position);
    android.content.ClipData data = android.content.ClipData.newPlainText("", "");
    android.view.View.DragShadowBuilder shadowBuilder = new android.view.View.DragShadowBuilder(view);
    view.startDrag(data, shadowBuilder, view, 0);
    view.setVisibility(View.VISIBLE);
    return true;
}