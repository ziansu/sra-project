public void execute(hmi.flipper.informationstate.Record is) throws hmi.flipper.exceptions.TemplateRunException {
    java.util.ArrayList<java.lang.String> values = new java.util.ArrayList<java.lang.String>();
    for (hmi.flipper.behaviourselection.template.value.AbstractValue av : argValues) {
        hmi.flipper.behaviourselection.template.value.Value v = av.getValue(is);
        values.add(v.toString());
    }
    behaviour.execute(new java.util.ArrayList<java.lang.String>(argNames), new java.util.ArrayList<java.lang.String>(values));
}