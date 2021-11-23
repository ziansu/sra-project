public static ij.ImagePlus combineFrames(int nX, int nY, ij.ImagePlus[] imgs) {
    ij.ImagePlus resImp = fntd.stacks.StackOperations.imagesToStack(imgs);
    int nZ = resImp.getNSlices();
    if ((nZ % (nX * nY)) != 0) {
        java.lang.System.out.println("Combine frames: dimensions do not match!");
        return null;
    }
    resImp.setOpenAsHyperStack(true);
    resImp.setDimensions(1, (nZ / (nX * nY)), (nX * nY));
    return resImp;
}