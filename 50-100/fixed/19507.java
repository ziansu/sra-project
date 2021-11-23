protected static final void convolve2BlockCPU(final spim.process.cuda.Block blockStruct, final net.imglib2.img.Img<net.imglib2.type.numeric.real.FloatType> image, final net.imglib2.img.Img<net.imglib2.type.numeric.real.FloatType> result, final net.imglib2.img.Img<net.imglib2.type.numeric.real.FloatType> block, final net.imglib2.algorithm.fft2.FFTConvolution<net.imglib2.type.numeric.real.FloatType> fftConvolution2) {
    blockStruct.copyBlock(net.imglib2.view.Views.extendValue(image, new net.imglib2.type.numeric.real.FloatType(1.0F)), block);
    fftConvolution2.setImg(block);
    fftConvolution2.setOutput(block);
    fftConvolution2.convolve();
    blockStruct.pasteBlock(result, block);
}