public void initDeleteHead() {
    android.util.Log.d("testing", "addview1");
    deleteHead = new com.apps.my.liener.BubbleHead(context, heightNew, widthMid, BubbleHead.HEAD_TYPE_DELETE, (-1));
    deleteHead.initParams(0, ((int) ((heightNew) / 4)));
    deleteHead.layoutParams.gravity = (android.view.Gravity.BOTTOM) | (android.view.Gravity.CENTER);
}