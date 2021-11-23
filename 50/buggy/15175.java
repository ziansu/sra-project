@java.lang.Override
protected void onDettach() {
    super.onDettach();
    com.liangmayong.base.widget.themeskin.Skin.unregisterSkinRefresh(this);
}