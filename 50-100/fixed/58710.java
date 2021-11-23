public void register(org.openforis.collect.android.viewmodel.UiNode node) {
    super.register(node);
    if (((node instanceof org.openforis.collect.android.viewmodel.UiAttribute) && (node.getDefinition().isKeyOf(this))) && (!(keyAttributeIds.contains(node.getId())))) {
        keyAttributes.add(((org.openforis.collect.android.viewmodel.UiAttribute) (node)));
        keyAttributeIds.add(node.getId());
    }
}