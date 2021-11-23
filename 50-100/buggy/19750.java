public boolean onLongClick(android.view.View v) {
    android.content.ClipData.Item item = new android.content.ClipData.Item(v.getTag().toString());
    android.content.ClipData dragData = new android.content.ClipData(v.getTag(), android.content.ClipDescription.MIMETYPE_TEXT_PLAIN, item);
    android.view.View.DragShadowBuilder myShadow = new com.lorenzmacht.mobhp.Main.MyDragShadowBuilder(mobArea);
    v.startDrag(dragData, myShadow, null, 0);
}