@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null) {
        for (int i = 0; i < (contentLinearLayout.getChildCount()); i++) {
        }
        onItemClickListener.onClick(v, viewPosMap.get(v));
    }
}