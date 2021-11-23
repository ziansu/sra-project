@org.springframework.integration.annotation.ServiceActivator(inputChannel = "xmlTransformedSocial")
public void transformedXMLProcess(uk.gov.ons.ctp.response.sample.definition.SocialSurveySample socialSurveySample) {
    log.info(java.lang.String.format("SocialSurveySample (Collection Exercise Ref: %s) transformed successfully.", socialSurveySample.getCollectionExerciseRef()));
    uk.gov.ons.ctp.response.sample.domain.model.SampleSummary savedSampleSummary = sampleService.createandSaveSampleSummary(socialSurveySample);
    java.util.List<uk.gov.ons.ctp.response.sample.definition.SocialSampleUnit> samplingUnitList = socialSurveySample.getSampleUnits().getSocialSampleUnits();
    sampleService.createandSaveSampleUnits(samplingUnitList, savedSampleSummary);
    sampleService.sendSocialToParty(savedSampleSummary.getSampleId(), socialSurveySample);
}