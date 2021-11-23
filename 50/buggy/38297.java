private static java.lang.String WrapHeader(java.lang.String s) {
    return com.upokecenter.test.Reflect.Invoke(com.upokecenter.test.Reflect.Construct(((com.upokecenter.test.EncodingTest.MailNamespace()) + ".WordWrapEncoder"), ""), "AddString", s).toString();
}