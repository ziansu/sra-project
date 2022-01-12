@java.lang.Override
public void process(javax.lang.model.element.Element element, org.androidannotations.holder.EComponentWithViewSupportHolder holder) {
    java.lang.String fieldName = element.getSimpleName().toString();
    javax.lang.model.type.TypeMirror uiFieldTypeMirror = element.asType();
    java.lang.String typeQualifiedName = uiFieldTypeMirror.toString();
    com.sun.codemodel.JFieldRef idRef = annotationHelper.extractOneAnnotationFieldRef(processHolder, element, IRClass.Res.ID, true);
    com.sun.codemodel.JClass viewClass = refClass(typeQualifiedName);
    com.sun.codemodel.JFieldRef fieldRef = com.sun.codemodel.JExpr.ref(fieldName);
    holder.assignFindViewById(idRef, viewClass, fieldRef);
}