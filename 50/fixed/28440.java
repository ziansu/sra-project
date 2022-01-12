private void closeQuoteDataset() throws nz.co.jsrsolutions.ds3.EodDataSinkException {
    if ((quoteDatasetHandle) >= 0) {
        try {
            ncsa.hdf.hdf5lib.H5.H5Dclose(quoteDatasetHandle);
            quoteDatasetHandle = -1;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }
}