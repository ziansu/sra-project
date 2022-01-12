@java.lang.Override
public boolean onLongClick(android.view.View v) {
    v.getTag();
    android.content.ClipData.Item item = new android.content.ClipData.Item(((java.lang.CharSequence) (v.getTag())));
    android.content.ClipData dragData = new android.content.ClipData(((java.lang.CharSequence) (v.getTag())), new java.lang.String[]{ android.content.ClipDescription.MIMETYPE_TEXT_PLAIN }, item);
    android.view.View.DragShadowBuilder myShadow = new com.example.arunkarka.cookrecipe.BonusActivity.MyDragShadowBuilder(v);
    v.startDrag(dragData, myShadow, v, 0);
    v.setVisibility(View.INVISIBLE);
    return true;
}