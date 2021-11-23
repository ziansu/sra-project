@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null) {
        for (int i = 0; i < (contentLinearLayout.getChildCount()); i++) {
            contentLinearLayout.getChildAt(i).setBackgroundColor(color.main_background_color);
        }
        onItemClickListener.onClick(v, viewPosMap.get(v));
    }
}