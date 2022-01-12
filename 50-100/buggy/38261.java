@java.lang.Override
public void handleMouseInput() throws java.io.IOException {
    super.handleMouseInput();
    if (!(previewStackBoxClicked))
        bitMappingList.handleMouseInput();
    
    org.apache.commons.lang3.tuple.Pair<net.minecraft.util.math.Vec3d, java.lang.Float> pair = com.phylogeny.extrabitmanipulation.client.GuiHelper.scaleObjectWithMouseWheel(this, previewStackBox, previewStackTranslation, previewStackScale, 30.0F);
    previewStackTranslation = pair.getLeft();
    previewStackScale = pair.getRight();
}