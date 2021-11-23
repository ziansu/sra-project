public org.opencv.core.Mat getNormFace(org.opencv.core.Mat pic, org.opencv.core.Mat pts) {
    float[] ptsdata = new float[pts.rows()];
    pts.get(0, 0, ptsdata);
    org.opencv.core.Mat result = org.opencv.core.Mat.zeros(new org.opencv.core.Size(resolutionX, resolutionY), pic.type());
    pers.season.vml.statistics.texture.TextureModel.AffineTexture(pic, pts, result, stdShape, delaunay);
    return result;
}