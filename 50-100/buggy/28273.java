public void setup() {
    java.util.List<uvm.UvImage> ads = uvm.UvImage.fromFolder(this, uvm.UvMapper.IMAGE_DIR, uvm.UvMapper.MAX_NUM_IMGS_TO_LOAD);
    java.util.List<uvm.Quad> quads = uvm.Quad.fromData(this, uvm.UvMapper.DATA_FILE);
    int processed = assignImages(ads, quads);
    java.lang.System.out.println((((("\nProcessed " + processed) + "/") + (quads.size())) + " Quads"));
    uvm.Quad.drawAll(quads);
}