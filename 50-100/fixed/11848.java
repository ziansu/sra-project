public void shutdown() {
    java.lang.System.out.println("\n\n\n");
    java.lang.System.out.println("   ********* Graceful exit initiated");
    producer.shutdown();
    java.lang.System.out.println("   ********* Destroying xMsg context : done");
    registrar.shutdown();
    java.lang.System.out.println("   ********* Registrar shudown  : done");
    proxy.shutdown();
    java.lang.System.out.println("   ********* Proxy service  shudown  : done");
    java.lang.System.out.println("   ********* Exiting Data Distribution\n\n");
    java.lang.System.exit(0);
}