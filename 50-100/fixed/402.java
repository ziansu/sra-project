@cli.Command
@java.lang.Override
public java.lang.String nameservers() throws java.io.IOException {
    java.lang.String result = "";
    java.util.List<java.lang.String> subHosts = remoteNamserverCallback.getSubHosts();
    java.util.Collections.sort(subHosts);
    for (java.lang.String subHost : subHosts) {
        int index = (subHosts.indexOf(subHost)) + 1;
        result += ((index + ". ") + subHost) + "\n";
    }
    return result;
}