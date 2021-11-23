@java.lang.Override
public org.apache.commons.lang3.tuple.Pair<net.minecraft.client.resources.model.IBakedModel, javax.vecmath.Matrix4f> handlePerspective(net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType cameraTransformType) {
    if (transforms.isEmpty())
        return org.apache.commons.lang3.tuple.Pair.of(this, null);
    
    org.apache.commons.lang3.tuple.Pair<net.minecraftforge.client.model.MultiModel.Baked, net.minecraftforge.client.model.TRSRTransformation> p = transforms.get(cameraTransformType);
    return org.apache.commons.lang3.tuple.Pair.of(p.getLeft(), p.getRight().getMatrix());
}