@org.junit.Test
public void testValidChoice() throws org.quattor.pan.exceptions.SyntaxException {
    org.quattor.pan.template.Context context = new org.quattor.pan.template.BuildContext();
    java.util.List<org.quattor.pan.dml.data.Element> args = new java.util.ArrayList<org.quattor.pan.dml.data.Element>();
    args.add(org.quattor.pan.dml.data.StringProperty.getInstance("A"));
    args.add(org.quattor.pan.dml.data.StringProperty.getInstance("B"));
    org.quattor.pan.type.BaseType type = new org.quattor.pan.type.ChoiceType(null, null, args);
    java.lang.Object o = type.validate(context, org.quattor.pan.dml.data.StringProperty.getInstance("A"));
    org.junit.Assert.assertEquals(o, null);
}