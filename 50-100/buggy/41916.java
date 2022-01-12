@java.lang.Override
public boolean renderStatic(techreborn.lib.vecmath.Vecs3d translation, uk.co.qmunity.lib.client.render.RenderHelper renderer, int pass) {
    renderer.setOverrideTexture(techreborn.partSystem.parts.CablePart.getIconFromType(type));
    renderer.renderBox(techreborn.partSystem.QLib.ModLib2QLib.convert(boundingBoxes[6]));
    if ((connectedSides) != null) {
        for (net.minecraftforge.common.util.ForgeDirection dir : net.minecraftforge.common.util.ForgeDirection.VALID_DIRECTIONS) {
            if (connectedSides.containsKey(dir))
                renderer.renderBox(techreborn.partSystem.QLib.ModLib2QLib.convert(boundingBoxes[techreborn.lib.Functions.getIntDirFromDirection(dir)]));
            
        }
    }
    return true;
}