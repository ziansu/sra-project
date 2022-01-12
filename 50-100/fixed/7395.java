private void freezeValues(net.ssehub.easy.varModel.model.AbstractVariable var, net.ssehub.easy.varModel.confModel.IFreezeSelector selector) {
    if ((var.isTopLevel()) || ((var.getParent()) instanceof net.ssehub.easy.varModel.model.AttributeAssignment)) {
        net.ssehub.easy.varModel.confModel.IDecisionVariable frozenVariable = getDecision(var);
        if (null != frozenVariable) {
            frozenVariable.freeze(selector);
        }
    }else {
        net.ssehub.easy.varModel.model.IModelElement parent = var.getParent();
        java.lang.System.out.println(("Config freeze for nested variable not implemented: " + parent));
    }
}