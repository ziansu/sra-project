@java.lang.Override
public java.lang.String show() {
    app_info.Configuration conf = app_info.Configuration.getInstance();
    java.lang.String body = showBody();
    body = trimOrFill(body);
    java.lang.String whole = body + '\n';
    whole += formatter.spec(IFormatter.SpecialFormat.UNDERSCORE, indent(conf.getWidth()));
    whole += ('\n' + (msg)) + '\n';
    whole += formatter.spec(IFormatter.SpecialFormat.UNDERSCORE, indent(conf.getWidth()));
    whole += (command) + '\n';
    return whole;
}