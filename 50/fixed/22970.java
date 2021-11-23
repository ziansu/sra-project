@java.lang.Override
protected void registerFactories(org.xwiki.security.authorization.testwikis.internal.parser.ElementParser parser, org.xwiki.security.authorization.testwikis.TestDocument entity) {
    super.registerFactories(parser, entity);
    parser.register(new org.xwiki.security.authorization.testwikis.internal.parser.TestGroupUserFactory(entity));
}