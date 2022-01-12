public static void main(java.lang.String[] args) {
    final org.junit.runner.Result result = org.junit.runner.JUnitCore.runClasses(codeu.chat.common.SecretTest.class, codeu.chat.relay.ServerTest.class, codeu.chat.server.BasicControllerTest.class, codeu.chat.server.RawControllerTest.class, codeu.chat.util.TimeTest.class, codeu.chat.util.UuidTest.class, codeu.chat.util.TokenizerTest.class, codeu.chat.util.store.StoreTest.class, codeu.chat.relay.ServerTest.class);
    for (final org.junit.runner.notification.Failure failure : result.getFailures()) {
        java.lang.System.out.println(failure.toString());
    }
    java.lang.System.out.println(result.wasSuccessful());
}