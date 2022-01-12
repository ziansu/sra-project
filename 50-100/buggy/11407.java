public uk.ac.starlink.ttools.plot2.layer.BinBag.Bin next() {
    if ((ib) < nbin) {
        uk.ac.starlink.ttools.plot2.layer.BinBag.Bin bin = createBin(((index)++), binValues[ib]);
        if ((index) >= (binIndices[ib])) {
            (ib)++;
        }
        return bin;
    }else {
        throw new java.util.NoSuchElementException();
    }
}