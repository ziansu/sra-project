public com.sewm.defaultteam.Target parseTarget() throws java.io.IOException {
    java.lang.String line = file_.readLine();
    if (line.contains(";")) {
        return null;
    }
    java.lang.System.out.println(("parsing target: " + line));
    java.util.Scanner s = new java.util.Scanner(line).useDelimiter("[,]");
    com.sewm.defaultteam.Target target = new com.sewm.defaultteam.Target(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.next());
    return target;
}