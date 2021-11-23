@java.lang.Override
public java.lang.Object invoke(org.kohsuke.stapler.StaplerRequest req, org.kohsuke.stapler.StaplerResponse rsp, java.lang.Object instance, java.lang.Object[] arguments) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
    shouldBePostMethod(req);
    returnsInstanceIdentityIfLocalUrlTest(req);
    shouldContainParseablePayload(arguments);
    shouldProvideValidSignature(req, arguments);
    return target.invoke(req, rsp, instance, arguments);
}