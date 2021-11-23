private static net.selenate.client.Config loadAkkaConfig(final java.lang.String clientHost) {
    final net.selenate.client.ConfigValue hostnameVal = net.selenate.client.ConfigValueFactory.fromAnyRef(clientHost);
    final net.selenate.client.Config c = net.selenate.client.ConfigFactory.parseResources("akka.config").withValue("akka.remote.netty.tcp.hostname", hostnameVal);
    java.lang.System.out.println(c);
    return c;
}