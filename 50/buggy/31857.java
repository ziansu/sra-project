public void setPortraitResolution(int width, int height) {
    net.ossrs.yasea.SrsEncoder.vOutWidth = width;
    net.ossrs.yasea.SrsEncoder.vOutHeight = height;
    net.ossrs.yasea.SrsEncoder.vPortraitWidth = width;
    net.ossrs.yasea.SrsEncoder.vPortraitHeight = height;
    net.ossrs.yasea.SrsEncoder.vLandscapeWidth = height;
    net.ossrs.yasea.SrsEncoder.vLandscapeHeight = width;
}