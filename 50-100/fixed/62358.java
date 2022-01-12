public void addEqualsArg(java.lang.String name, java.lang.String value) {
    if ((value != null) && ((value.length()) > 0)) {
        args.add(org.eclipse.jetty.start.CommandLineBuilder.quote(((name + "=") + value)));
    }else {
        args.add(org.eclipse.jetty.start.CommandLineBuilder.quote(name));
    }
}