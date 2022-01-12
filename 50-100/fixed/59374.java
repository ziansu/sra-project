private ij.process.ImageProcessor getRoiIp(ij.process.ImageProcessor channelIp, int index) {
    ij.process.ImageProcessor roiIp = null;
    if (index < 0) {
        roiIp = channelIp;
    }else {
        ij.ImagePlus roiImage = ij.WindowManager.getImage(imageList.get(index));
        if (roiImage != null) {
            roiIp = roiImage.getProcessor();
            roiIp.setRoi(roiImage.getRoi());
        }
    }
    return roiIp;
}