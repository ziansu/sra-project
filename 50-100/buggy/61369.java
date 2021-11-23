public java.lang.String getVariables(org.gemoc.mocc.ccslmoc.model.moccml.StateMachineRelationDefinition sm) {
    java.lang.StringBuilder st = new java.lang.StringBuilder();
    for (fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ConcreteEntity ce : sm.getDeclarationBlock().getConcreteEntities()) {
        if ((st.length()) != 0) {
            st.append(" ");
        }
        st.append(":").append(ce.getName());
    }
    return st.toString();
}