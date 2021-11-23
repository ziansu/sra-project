@java.lang.Override
public boolean isAmbientOcclusion() {
    refreshBakedModels();
    return baseModel.isAmbientOcclusion();
}