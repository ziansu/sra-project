public static java.lang.String execCmd(java.lang.String cmd) throws java.io.IOException {
    java.util.Scanner s = new java.util.Scanner(java.lang.Runtime.getRuntime().exec(cmd).getInputStream()).useDelimiter("\\A");
    return s.hasNext() ? s.next() : "";
}