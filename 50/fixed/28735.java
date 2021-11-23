public static boolean isValidFile(ucar.unidata.io.RandomAccessFile raf) throws java.io.IOException {
    switch (checkFileType(raf)) {
        case NC_FORMAT_NETCDF4 :
            return true;
        default :
            break;
    }
    return false;
}