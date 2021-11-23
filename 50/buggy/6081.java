private void setBase() {
    setContentView(ru.velkonost.lume.activity.BoardColumnsActivity.LAYOUT);
    butterknife.ButterKnife.bind(this);
    setTheme(R.style.AppTheme_Cursor);
    ru.velkonost.lume.Managers.TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Roboto-Regular.ttf");
}