private buildcraft.transport.client.model.ModelKeyGate getState(net.minecraft.item.ItemStack stack) {
    buildcraft.transport.gates.GateDefinition.GateMaterial material = buildcraft.transport.gates.ItemGate.getMaterial(stack);
    buildcraft.transport.gates.GateDefinition.GateLogic logic = buildcraft.transport.gates.ItemGate.getLogic(stack);
    java.util.Set<buildcraft.api.gates.IGateExpansion> expansions = buildcraft.transport.gates.ItemGate.getInstalledExpansions(stack);
    java.util.Set<buildcraft.api.gates.IGateExpansion.IGateStaticRenderState> states = com.google.common.collect.Sets.newHashSet();
    for (buildcraft.api.gates.IGateExpansion exp : expansions)
        states.add(exp.getRenderState());
    
    return new buildcraft.transport.client.model.ModelKeyGate(net.minecraft.util.EnumFacing.UP, material, logic, expansions.toArray(new buildcraft.api.gates.IGateExpansion[0]));
}