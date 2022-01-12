@java.lang.Override
public boolean eachChild(final com.webfirmframework.wffweb.tag.html.AbstractHtml child) {
    final com.webfirmframework.wffweb.tag.html.attribute.core.AbstractAttribute idAttr = child.getAttributeByName(AttributeNameConstants.ID);
    if (((idAttr != null) && (attributeName.equals(idAttr.getAttributeName()))) && (attributeValue.equals(idAttr.getAttributeValue()))) {
        matchingTag[0] = child;
        return false;
    }
    return true;
}