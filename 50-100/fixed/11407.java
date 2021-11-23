public uk.ac.starlink.ttools.plot2.layer.BinBag.Bin next() {
    if ((ib) < nbin) {
        assert (index) >= (binIndices[ib]);
        uk.ac.starlink.ttools.plot2.layer.BinBag.Bin bin = createBin(index, binValues[ib]);
        (index)++;
        if (((ib) == (nbin - 1)) || ((index) == (binIndices[((ib) + 1)]))) {
            (ib)++;
        }
        return bin;
    }else {
        throw new java.util.NoSuchElementException();
    }
}