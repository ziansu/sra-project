@org.junit.After
public void afterEachTest() {
    try {
        factory.closeFile(fileId);
    } catch (ncsa.hdf.hdf5lib.exceptions.HDF5LibraryException e) {
        org.junit.Assert.fail((((((getClass().getName()) + " error: ") + " Could not close HDF file \"") + (file.getPath())) + "\"."));
    }
    if ((file) != null) {
        if (file.exists()) {
            file.delete();
        }
        file = null;
    }
    return ;
}