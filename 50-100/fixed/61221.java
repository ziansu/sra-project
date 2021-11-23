private static void setupTheme(final long groupId, final com.mimacom.liferay.portal.setup.domain.Theme theme, final boolean isPrivate) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
    com.mimacom.liferay.portal.setup.core.Group group = com.mimacom.liferay.portal.setup.core.GroupLocalServiceUtil.getGroup(groupId);
    com.mimacom.liferay.portal.setup.core.LayoutSet set;
    if (isPrivate) {
        set = group.getPrivateLayoutSet();
    }else {
        set = group.getPublicLayoutSet();
    }
    set.setThemeId(theme.getName());
}