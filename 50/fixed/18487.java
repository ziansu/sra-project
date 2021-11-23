public static org.csstudio.opibuilder.model.AbstractWidgetModel XMLElementToWidget(org.jdom.Element element, org.csstudio.opibuilder.model.DisplayModel displayModel) throws java.lang.Exception {
    return org.csstudio.opibuilder.persistence.XMLUtil.XMLElementToWidgetSub(element, displayModel, new java.util.ArrayList<org.eclipse.core.runtime.IPath>());
}