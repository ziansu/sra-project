@java.lang.Override
protected void applyVOut(org.jwildfire.create.tina.base.XYZPoint pAffineTP, org.jwildfire.create.tina.base.XYZPoint pVarTP, org.jwildfire.create.tina.variation.Double4 pVOut, double pWeight) {
    pAffineTP.x = (pVOut.x) * pWeight;
    pAffineTP.y = (pVOut.y) * pWeight;
    pAffineTP.z = (pVOut.z) * pWeight;
}