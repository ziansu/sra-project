public void avgyro(org.ejml.data.DenseMatrix64F out) {
    if ((acing) > 0) {
        org.ejml.ops.CommonOps.scale((1 / (acing)), acgyro, out);
        org.instk.demo_1001.INS.skew(vr_a, out);
    }else
        out.zero();
    
}