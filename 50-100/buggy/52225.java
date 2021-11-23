@java.lang.Override
protected void applyVOut(org.jwildfire.create.tina.base.XYZPoint pAffineTP, org.jwildfire.create.tina.base.XYZPoint pVarTP, org.jwildfire.create.tina.variation.Double4 pVOut, double pWeight) {
    pVarTP.x += (pVOut.x) * pWeight;
    pVarTP.y += (pVOut.y) * pWeight;
    pVarTP.z += (pVOut.z) * pWeight;
}