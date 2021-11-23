public void addReflection() {
    if (this.region.equals("player"))
        net.pixelstatic.koru.Koru.log("!");
    
    net.pixelstatic.koru.sprites.Layer reflection = net.pixelstatic.koru.sprites.Layer.obtainLayer();
    reflection.region = region;
    reflection.setPosition(x, ((y) - ((net.pixelstatic.koru.sprites.Layer.atlas.regionHeight(region)) / 2))).setColor(color).setTemp().setScale(1.0F, (-1.0F)).setLayer(net.pixelstatic.koru.sprites.Layer.reflectionlayer).add();
}