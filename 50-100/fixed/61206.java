public void transformPropertyReference(cc.kave.commons.model.ssts.expressions.simple.IReferenceExpression expr) {
    cc.kave.commons.model.ssts.references.IPropertyReference propertyReference = ((cc.kave.commons.model.ssts.references.IPropertyReference) (expr.getReference()));
    cc.kave.commons.model.ssts.references.IFieldReference fieldReference = fieldReferenceToLocalField(createPropertyFieldName(propertyReference.getPropertyName()), propertyReference.getReference());
    cc.kave.commons.model.ssts.impl.expressions.simple.ReferenceExpression refExpr = ((cc.kave.commons.model.ssts.impl.expressions.simple.ReferenceExpression) (expr));
    refExpr.setReference(fieldReference);
}