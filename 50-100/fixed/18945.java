private static org.biojava.nbio.structure.symmetry.core.Rotation createSymmetryOperation(java.util.List<java.lang.Integer> permutation, javax.vecmath.Matrix4d transformation, javax.vecmath.AxisAngle4d axisAngle, int fold, org.biojava.nbio.structure.symmetry.core.QuatSymmetryScores scores) {
    org.biojava.nbio.structure.symmetry.core.Rotation s = new org.biojava.nbio.structure.symmetry.core.Rotation();
    s.setPermutation(new java.util.ArrayList<java.lang.Integer>(permutation));
    s.setTransformation(new javax.vecmath.Matrix4d(transformation));
    s.setAxisAngle(new javax.vecmath.AxisAngle4d(axisAngle));
    s.setFold(fold);
    s.setScores(scores);
    return s;
}