@java.lang.Override
public void afterLocalConstructing(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (((modelBiped) == null) || ((modelBiped) instanceof net.minecraft.client.model.ModelPlayer)) {
        bipedModel = new net.minecraft.client.model.ModelBiped();
        bipedModel.isChild = false;
    }else {
        bipedModel = modelBiped;
    }
}