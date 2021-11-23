@org.junit.Test(expected = org.quattor.pan.exceptions.ValidationException.class)
public void testInvalidSelfValidation() throws org.quattor.pan.exceptions.SyntaxException {
    org.quattor.pan.template.Context context = new org.quattor.pan.template.BuildContext();
    java.util.List<org.quattor.pan.dml.data.Element> args = new java.util.ArrayList<org.quattor.pan.dml.data.Element>();
    args.add(org.quattor.pan.dml.data.StringProperty.getInstance("A"));
    args.add(org.quattor.pan.dml.data.StringProperty.getInstance("B"));
    org.quattor.pan.type.BaseType type = org.quattor.pan.type.ChoiceType.getInstance(null, null, args);
    type.validate(context, org.quattor.pan.dml.data.LongProperty.getInstance(1));
}