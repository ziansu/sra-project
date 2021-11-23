protected java.lang.String getGroupRedirect(com.liferay.portal.theme.ThemeDisplay themeDisplay, long groupId) throws java.lang.Exception {
    java.util.List<com.liferay.portal.model.Layout> layouts = com.liferay.portal.service.LayoutLocalServiceUtil.getLayouts(groupId, false, LayoutConstants.DEFAULT_PARENT_LAYOUT_ID, false, 0, 1);
    if ((layouts.size()) > 0) {
        com.liferay.portal.model.Layout layout = layouts.get(0);
        return com.liferay.portal.util.PortalUtil.getLayoutURL(layout, themeDisplay);
    }
    return null;
}