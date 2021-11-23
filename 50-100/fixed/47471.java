@java.lang.Override
public boolean eachChild(final com.webfirmframework.wffweb.tag.html.AbstractHtml child) {
    final com.webfirmframework.wffweb.tag.html.attribute.core.AbstractAttribute attribute = child.getAttributeByName(attributeName);
    if ((attribute != null) && (attributeValue.equals(attribute.getAttributeValue()))) {
        matchingTag[0] = child;
        return false;
    }
    return true;
}