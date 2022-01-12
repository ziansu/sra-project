public static java.lang.String HierarchicalSubStateMachineClassHeader(java.lang.String dependency_, java.lang.String className_, java.lang.String parentclass_, java.util.List<java.lang.String> subMachines_, java.lang.String public_, java.lang.String protected_, java.lang.String private_) {
    java.util.List<java.lang.String> parentParam = new java.util.LinkedList<java.lang.String>();
    parentParam.add(parentclass_);
    return hu.elte.txtuml.export.cpp.templates.GenerationTemplates.HierarchicalStateMachineClassHeader(dependency_, className_, parentParam, subMachines_, public_, protected_, ((hu.elte.txtuml.export.cpp.templates.PrivateFunctionalTemplates.SubStateMachineClassFixPrivateParts(parentclass_)) + private_), false);
}