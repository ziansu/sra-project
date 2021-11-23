public static hypercard.parts.FieldPart fromModel(hypercard.parts.CardPart parent, hypercard.parts.model.FieldModel model) throws java.lang.Exception {
    hypercard.parts.FieldPart field = new hypercard.parts.FieldPart(hypercard.parts.fields.FieldStyle.fromName(model.getKnownProperty(FieldModel.PROP_STYLE).stringValue()), parent);
    field.script = hypercard.runtime.Interpreter.compile(model.getKnownProperty(FieldModel.PROP_SCRIPT).stringValue());
    field.partModel = model;
    field.partModel.addPropertyChangedObserver(field);
    return field;
}