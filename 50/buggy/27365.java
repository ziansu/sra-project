@java.lang.Override
protected java.util.LinkedList<eis.iilang.Percept> getAllPerceptsFromEntity(final java.lang.String e) throws eis.exceptions.NoEnvironmentException, eis.exceptions.PerceiveException {
    return getEntity(e).getPercepts();
}