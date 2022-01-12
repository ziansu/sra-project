private org.ietr.preesm.experiment.model.pimm.FunctionPrototype createFunctionPrototypeFrom(org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration simpleDecl) {
    org.ietr.preesm.experiment.model.pimm.FunctionPrototype proto = PiMMFactory.eINSTANCE.createFunctionPrototype();
    org.eclipse.cdt.ui.FunctionPrototypeSummary summary = new org.eclipse.cdt.ui.FunctionPrototypeSummary(simpleDecl.getRawSignature());
    proto.setName(summary.getName());
    java.lang.String argumentsString = summary.getArguments();
    for (java.lang.String argument : argumentsString.split(",")) {
        proto.getParameters().add(createFunctionParameterFrom(argument));
    }
    return proto;
}