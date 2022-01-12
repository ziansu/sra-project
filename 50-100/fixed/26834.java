@java.lang.Override
public int doStartTag() throws javax.servlet.jsp.JspException {
    try {
        _assetCategories = com.liferay.portlet.asset.service.AssetCategoryServiceUtil.getCategories(_className, _classPK);
        if (!(_assetCategories.isEmpty())) {
            return EVAL_BODY_INCLUDE;
        }
        return SKIP_BODY;
    } catch (java.lang.Exception e) {
        throw new javax.servlet.jsp.JspException(e);
    } finally {
        if (!(com.liferay.portal.kernel.util.ServerDetector.isResin())) {
            _className = null;
            _classPK = 0;
        }
    }
}