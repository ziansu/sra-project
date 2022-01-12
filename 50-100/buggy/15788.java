@java.lang.Override
public double getAlternativeAlleleFraction(htsjdk.variant.variantcontext.Genotype gt) {
    int[] ads = gt.getAD();
    int sum = 0;
    for (int i = 1; i < (ads.length); ++i)
        sum += ads[i];
    
    return ((double) (sum)) / (gt.getDP());
}