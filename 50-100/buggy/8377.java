@java.lang.Override
protected void removeInfoView(android.view.View view) {
    if ((view.getParent()) != null)
        ((android.view.ViewGroup) (view.getParent())).removeView(view);
    
    ((android.widget.LinearLayout) (guiView.findViewById(R.id.infoLayout))).removeView(view);
}