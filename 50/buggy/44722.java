protected static joptsimple.OptionParser getParser() {
    joptsimple.OptionParser parser = new joptsimple.OptionParser();
    voldemort.tools.admin.AdminParserUtils.acceptsHelp(parser);
    voldemort.tools.admin.AdminParserUtils.acceptsNodeSingle(parser);
    voldemort.tools.admin.AdminParserUtils.acceptsUrl(parser);
    voldemort.tools.admin.AdminParserUtils.acceptsConfirm(parser);
    return parser;
}