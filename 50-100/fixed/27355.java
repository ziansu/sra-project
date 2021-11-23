@java.lang.Override
public void prepare(java.util.Map<java.lang.String, java.lang.Object> contextObjects, javax.servlet.http.HttpServletRequest request) {
    if (!(isShowProductMenu(request))) {
        return ;
    }
    java.lang.String cssClass = com.liferay.portal.kernel.util.GetterUtil.getString(contextObjects.get("bodyCssClass"));
    java.lang.String productMenuState = com.liferay.portal.util.SessionClicks.get(request, "com.liferay.control.menu.web_productMenuState", "closed");
    contextObjects.put("bodyCssClass", ((cssClass + (com.liferay.portal.kernel.util.StringPool.SPACE)) + productMenuState));
    contextObjects.put("liferay_product_menu_state", productMenuState);
}