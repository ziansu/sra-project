@java.lang.Override
protected void addInstance(java.lang.String label, edu.emory.mathcs.nlp.learn.vector.StringVector vector) {
    java.lang.System.out.println(((label + " ") + (vector.toString())));
    models[0].addInstance(new edu.emory.mathcs.nlp.learn.util.StringInstance(label, vector));
}