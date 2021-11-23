@java.lang.Override
public java.io.Writer createEscapingWriterFor(java.io.OutputStream theOut, java.lang.String theEnc) throws java.io.UnsupportedEncodingException {
    return createEscapingWriterFor(new java.io.OutputStreamWriter(theOut, theEnc), theEnc);
}