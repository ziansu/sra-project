public static georegression.struct.se.Se3_F64 convert(georegression.struct.se.Se3_F32 src, georegression.struct.se.Se3_F64 dst) {
    if (dst == null) {
        dst = new georegression.struct.se.Se3_F64();
    }
    org.ejml.ops.ConvertMatrixData.convert(src.getR(), dst.getR());
    georegression.struct.ConvertFloatType.convert(src.T, dst.T);
    return dst;
}