@java.lang.Override
public void onSuccess(com.linkedin.r2.message.rest.RestResponse result, com.linkedin.restli.server.RequestExecutionReport executionReport, com.linkedin.restli.server.RestLiResponseAttachments responseAttachments) {
    junit.framework.Assert.assertEquals(result.getHeader(RestConstants.HEADER_CONTENT_TYPE), com.linkedin.restli.server.TestParseqTraceDebugRequestHandler.HEADER_VALUE_APPLICATION_JSON);
    java.lang.String traceJson = result.getEntity().asString(java.nio.charset.Charset.forName("UTF-8"));
    junit.framework.Assert.assertEquals(traceJson, com.linkedin.restli.server.TestParseqTraceDebugRequestHandler.TEST_TRACE);
}