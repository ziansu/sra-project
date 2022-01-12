@java.lang.Override
public boolean rewriteable() {
    if ((((this.input) == null) || ((this.fileOffset) < 0)) || ((((getTrueSize()) + (nom.tam.fits.Data.FITS_BLOCK_SIZE_MINUS_ONE)) / (FitsFactory.FITS_BLOCK_SIZE)) != (((this.dataSize) + (nom.tam.fits.Data.FITS_BLOCK_SIZE_MINUS_ONE)) / (FitsFactory.FITS_BLOCK_SIZE)))) {
        return false;
    }else {
        return true;
    }
}