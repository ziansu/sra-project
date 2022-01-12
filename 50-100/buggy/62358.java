public void addEqualsArg(java.lang.String name, java.lang.String value) {
    if ((value != null) && ((value.length()) > 0)) {
        args.add(((name + "=") + (org.eclipse.jetty.start.CommandLineBuilder.quote(value))));
    }else {
        args.add(name);
    }
}