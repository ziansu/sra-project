public static void setFM(final java.lang.String fmfile) {
    cmu.conditional.Conditional.cache.clear();
    cmu.conditional.Conditional.features.clear();
    cmu.conditional.Conditional.fm = ((de.fosd.typechef.featureexpr.bdd.BDDFeatureModel) ((fmfile.isEmpty()) ? null : de.fosd.typechef.featureexpr.FeatureExprFactory.bdd().featureModelFactory().createFromDimacsFile(fmfile)));
    if ((cmu.conditional.Conditional.fm) != null) {
        cmu.conditional.Conditional.createBDDFeatureModel();
    }else {
        cmu.conditional.Conditional.bddFM = ((de.fosd.typechef.featureexpr.bdd.BDDFeatureExpr) (de.fosd.typechef.featureexpr.FeatureExprFactory.True()));
    }
}