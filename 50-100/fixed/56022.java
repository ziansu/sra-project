protected void initializeObjectSystem() {
    if (alreadyInitialized) {
        return ;
    }else {
        super.initializeObjectSystem();
        initializeSystemClass(som.vm.constants.MateClasses.environmentMO, som.vm.constants.Classes.objectClass, "EnvironmentMO");
        initializeSystemClass(som.vm.constants.MateClasses.operationalSemanticsMO, som.vm.constants.Classes.objectClass, "OperationalSemanticsMO");
        initializeSystemClass(som.vm.constants.MateClasses.messageMO, som.vm.constants.Classes.objectClass, "MessageMO");
        initializeSystemClass(som.vm.constants.MateClasses.ShapeClass, som.vm.constants.Classes.objectClass, "Shape");
        loadSystemClass(som.vm.constants.MateClasses.environmentMO);
        loadSystemClass(som.vm.constants.MateClasses.operationalSemanticsMO);
        loadSystemClass(som.vm.constants.MateClasses.messageMO);
        loadSystemClass(som.vm.constants.MateClasses.ShapeClass);
        som.interpreter.nodes.MessageSendNode.AbstractMessageSendNode.specializationFactory = new som.interpreter.nodes.MateMessageSpecializationsFactory();
    }
}