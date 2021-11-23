@java.lang.Override
public void onBindViewHolder(final com.thekadesikhaana.adapter.MenuAdapter.MyViewHolder holder, final int listPosition) {
    android.widget.TextView menuContent = holder.menuContent;
    android.widget.ImageView menuType = holder.menuType;
    android.widget.ImageView menuImage = holder.menuImage;
    menuContent.setText(dataSet.get(listPosition).getItems());
    int menuTypeImage;
    menuTypeImage = R.drawable.app_icon;
    menuType.setImageResource(menuTypeImage);
    android.util.Log.d(com.thekadesikhaana.adapter.MenuAdapter.TAG, ("IMAGE URL:" + (dataSet.get(listPosition).getUrlMobile())));
}