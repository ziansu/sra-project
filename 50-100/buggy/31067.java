@java.lang.Override
public org.n52.shetland.ogc.sos.ro.RelatedOfferings decode(net.opengis.sosro.x10.RelatedOfferingsPropertyType rot) throws org.n52.svalbard.decode.exception.DecodingException {
    org.n52.shetland.ogc.sos.ro.RelatedOfferings relatedOfferings = new org.n52.shetland.ogc.sos.ro.RelatedOfferings();
    relatedOfferings.setNamespace(RelatedOfferingConstants.NS_RO);
    relatedOfferings.setDefinition(RelatedOfferingConstants.RELATED_OFFERINGS);
    relatedOfferings.setIdentifier(RelatedOfferingConstants.RELATED_OFFERINGS);
    for (net.opengis.sosro.x10.RelatedOfferingsType.RelatedOffering relatedOffering : rot.getRelatedOfferings().getRelatedOfferingArray()) {
        relatedOfferings.getValue().add(parseRelatedOffering(relatedOffering));
    }
    return relatedOfferings;
}