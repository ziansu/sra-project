public void changeTheme(int themeId) {
    if (themeId == (cn.zhihu.daily.zhihu_daily.constant.Constant.THEME_HOME_ID)) {
        if ((contentList.getAdapter()) != (contentListAdapter))
            contentList.setAdapter(contentListAdapter);
        
        this.themeId = cn.zhihu.daily.zhihu_daily.constant.Constant.THEME_HOME_ID;
    }else {
        themeStoriesListAdapter = new cn.zhihu.daily.zhihu_daily.adapter.ThemeStoriesListAdapter(getContext());
        contentList.setAdapter(themeStoriesListAdapter);
        this.themeId = themeId;
    }
}