public final jnnet2.core.ConfusionMatrix count(final double predictedLabel, final double referenceLabel) {
    ++(multij.tools.Tools.getOrCreate(multij.tools.Tools.getOrCreate(this.data, predictedLabel, ((multij.tools.Factory) (DefaultFactory.TREE_MAP_FACTORY))), referenceLabel, jnnet2.core.ConfusionMatrix.INDIRECT_DOUBLE_FACTORY)[0]);
    return this;
}