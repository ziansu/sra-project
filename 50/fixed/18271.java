public gr.ntua.ivml.edmvalidation.xsd.ReportErrorHandler validateAgainstEdm(java.io.InputStream is) {
    return validateAgainstEdm(new javax.xml.transform.stream.StreamSource(is), true, true);
}