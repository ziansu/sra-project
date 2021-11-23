@org.junit.Test
public void testOpenFile() throws java.lang.Exception {
    long id = -1;
    try {
        id = org.eclipse.dawnsci.hdf5.HDF5FileFactory.H5Fopen(org.eclipse.dawnsci.hdf5.Hdf5Test.TestFileAbsolutePath, HDF5Constants.H5F_ACC_RDONLY, HDF5Constants.H5P_DEFAULT);
        if (id < 0)
            throw new java.lang.Exception("Cannot open hdf5 file!");
        
    } finally {
        if (id > (-1))
            ncsa.hdf.hdf5lib.H5.H5Fclose(id);
        
    }
}