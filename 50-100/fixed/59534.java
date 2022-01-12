@java.lang.Override
protected boolean processSquare(boofcv.struct.image.ImageFloat32 gray, boofcv.alg.fiducial.Result result) {
    int off = ((gray.width) - (binaryInner.width)) / 2;
    gray.subimage(off, off, (off + (binaryInner.width)), (off + (binaryInner.width)), grayNoBorder);
    findBitCounts(grayNoBorder);
    if (thresholdBinaryNumber())
        return false;
    
    if (rotateUntilInLowerCorner(result))
        return false;
    
    result.which = extractNumeral();
    result.lengthSide = lengthSide;
    return true;
}