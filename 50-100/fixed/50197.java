public boofcv.abst.distort.FDistort init(boofcv.struct.image.ImageBase input, boofcv.struct.image.ImageBase output) {
    this.input = input;
    this.output = output;
    inputType = input.getImageType();
    interp(TypeInterpolate.BILINEAR);
    border(0);
    cached = false;
    distorter = null;
    outputToInput = null;
    return this;
}