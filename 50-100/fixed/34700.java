public static georegression.struct.point.Point3D_F64 triangulate(georegression.struct.point.Point2D_F64 leftPixel, georegression.struct.point.Point2D_F64 rightPixel, boofcv.struct.calib.StereoParameters stereoParam) {
    georegression.struct.point.Point3D_F64 result = new georegression.struct.point.Point3D_F64();
    georegression.struct.point.Point2D_F64 undistLeftPoint = distance3.CalculateDistance.removeDistortionFromPoint(leftPixel, stereoParam.getLeft());
    georegression.struct.point.Point2D_F64 undistRightPoint = distance3.CalculateDistance.removeDistortionFromPoint(rightPixel, stereoParam.getRight());
    boofcv.abst.geo.triangulate.WrapTwoViewsTriangulateDLT magic = new boofcv.abst.geo.triangulate.WrapTwoViewsTriangulateDLT();
    magic.triangulate(undistRightPoint, undistLeftPoint, stereoParam.rightToLeft, result);
    return result;
}