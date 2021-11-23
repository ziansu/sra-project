public void setTheme(int HeadColor) {
    android.util.Log.e("改变主题", (HeadColor + ""));
    fab_menu.setMenuButtonColorNormal(HeadColor);
    fab_menu.setMenuButtonColorPressed(HeadColor);
    fab_amend.setColorNormal(HeadColor);
    fab_amend.setColorPressed(HeadColor);
    fab_into.setColorNormal(HeadColor);
    fab_into.setColorPressed(HeadColor);
    fab_amend.setLabelColors(HeadColor, HeadColor, HeadColor);
    fab_into.setLabelColors(HeadColor, HeadColor, HeadColor);
    materialedit1.setTextColor(HeadColor);
    materialedit1.setPrimaryColor(HeadColor);
}