private void setParentSampleSuccess(org.apache.jmeter.protocol.http.sampler.HTTPSampleResult res, boolean initialValue) {
    if (!(org.apache.jmeter.protocol.http.sampler.HTTPSamplerBase.IGNORE_FAILED_EMBEDDED_RESOURCES)) {
        res.setSuccessful(initialValue);
        res.setResponseMessage("Embedded resource download error");
    }
}