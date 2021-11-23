@java.lang.Override
public void visitElement(com.android.tools.lint.detector.api.XmlContext context, org.w3c.dom.Element element) {
    java.lang.String tagName = element.getTagName();
    switch (tagName) {
        case com.android.SdkConstants.VIEW_INCLUDE :
            handleVisitIncludeTag(context, element);
            break;
        case com.android.SdkConstants.VIEW_MERGE :
            handleVisitMergeTag(context, element);
            break;
        case com.android.SdkConstants.VIEW_STUB :
            handleVisitViewStubTag(context, element);
            break;
    }
}