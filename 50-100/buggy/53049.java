public static boolean wasExecuted(com.sap.furcas.metamodel.FURCAS.TCS.ContextTemplate base, org.eclipse.emf.common.util.EList<java.lang.Integer> alternativeChoices, com.sap.furcas.metamodel.FURCAS.TCS.SequenceElement searchFor) {
    com.sap.furcas.metamodel.FURCAS.TCS.Sequence sequence = base.getTemplateSequence();
    return (sequence != null) && (com.sap.furcas.runtime.tcs.TcsUtil.wasExecuted(sequence, new java.util.LinkedList<java.lang.Integer>(alternativeChoices), searchFor));
}