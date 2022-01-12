public static void main(java.lang.String[] args) throws java.io.IOException, java.lang.InterruptedException, java.net.URISyntaxException {
    java.net.URI uri = new java.net.URI(args[0]);
    com.wouterhabets.dolphin.client.DolphinClient dolphinClient = new com.wouterhabets.dolphin.client.DolphinClient(uri, java.lang.Long.parseLong(args[1]));
    dolphinClient.run();
    java.lang.System.in.read();
}