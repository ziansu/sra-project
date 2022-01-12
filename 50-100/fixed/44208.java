public void setOpaqueAndCutout() {
    block.cutout = false;
    block.opaque = true;
    for (java.lang.String textureName : blockModel.textures.values()) {
        if ((textureName.startsWith("modbuilder:")) && (hasTransparency(textureName))) {
            block.cutout = true;
            block.opaque = false;
            break;
        }
    }
    if ((blockModel.parent.equals("cross")) || (!(block.solid))) {
        block.opaque = false;
    }
}