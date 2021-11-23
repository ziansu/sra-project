@java.lang.Override
protected void onDettach() {
    com.liangmayong.base.widget.themeskin.Skin.unregisterSkinRefresh(this);
    super.onDettach();
}