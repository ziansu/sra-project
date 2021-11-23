protected java.util.List<org.openflexo.foundation.fml.VirtualModel> _getControlledDocumentVirtualModels(org.openflexo.foundation.fml.ViewPoint viewPoint, org.openflexo.foundation.doc.nature.FMLControlledDocumentVirtualModelNature<MS> vmNature) {
    java.util.List<org.openflexo.foundation.fml.VirtualModel> returned = new java.util.ArrayList<org.openflexo.foundation.fml.VirtualModel>();
    for (org.openflexo.foundation.fml.VirtualModel vm : viewPoint.getVirtualModels()) {
        if (vm.hasNature(vmNature)) {
            returned.add(vm);
        }
    }
    return returned;
}