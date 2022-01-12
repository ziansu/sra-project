public static it.crs4.features.DType convertPixelType(int pixelType) {
    switch (pixelType) {
        case loci.formats.FormatTools.INT8 :
            return DType.INT8;
        case loci.formats.FormatTools.UINT8 :
            return DType.UINT8;
        case loci.formats.FormatTools.INT16 :
            return DType.INT16;
        case loci.formats.FormatTools.UINT16 :
            return DType.UINT16;
        case loci.formats.FormatTools.INT32 :
            return DType.INT32;
        case loci.formats.FormatTools.UINT32 :
            return DType.UINT32;
        case loci.formats.FormatTools.FLOAT :
            return DType.FLOAT32;
        case loci.formats.FormatTools.DOUBLE :
            return DType.FLOAT64;
        default :
            throw new java.lang.IllegalArgumentException(("Unknown pixel type: " + pixelType));
    }
}