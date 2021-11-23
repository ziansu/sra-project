public static com.opentext.ia.sdk.sip.PackagingInformation.PackagingInformationBuilder builder(com.opentext.ia.sdk.sip.PackagingInformation prototype) {
    com.opentext.ia.sdk.sip.PackagingInformation.PackagingInformationBuilder result = com.opentext.ia.sdk.sip.PackagingInformation.builder().dss(prototype.getDss()).last(prototype.isLast()).pageCount(prototype.getPageCount()).productionDate(prototype.getProductionDate()).sequenceNumber(prototype.getSequenceNumber());
    prototype.getCustomAttributes().forEach(result::customAttribute);
    return result;
}