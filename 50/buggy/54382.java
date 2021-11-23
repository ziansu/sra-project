@java.lang.Override
public void apply(htsjdk.variant.variantcontext.VariantContext variant, org.broadinstitute.hellbender.tools.ReadsContext readsContext, org.broadinstitute.hellbender.tools.ReferenceContext referenceContext, org.broadinstitute.hellbender.tools.FeatureContext featureContext) {
    org.broadinstitute.hellbender.tools.FixCallSetSampleOrdering.writer.add(variant);
}