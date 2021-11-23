public java.util.ArrayList<me.willjake.hamlet.cutscene.Frame> getFrames() {
    org.w3c.dom.NodeList rawFrames = this.element.getElementsByTagName("frame");
    java.util.ArrayList<me.willjake.hamlet.cutscene.Frame> frames = new java.util.ArrayList<me.willjake.hamlet.cutscene.Frame>();
    for (int i = 0; i < (rawFrames.getLength()); i++) {
        frames.add(new me.willjake.hamlet.cutscene.Frame(rawFrames.item(i)));
    }
    return new java.util.ArrayList<me.willjake.hamlet.cutscene.Frame>();
}