@java.lang.Override
public com.liferay.portal.model.PortletPreferences getStrictPreferences(long companyId, long ownerId, int ownerType, long plid, java.lang.String portletId) {
    return getPreferences(companyId, ownerId, ownerType, plid, portletId, null, (!(com.liferay.portal.util.PropsValues.TCK_URL)));
}