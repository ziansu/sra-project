private static java.util.Set<org.monospark.spongematchers.parser.element.StringElementParser> createBaseElementParsers() {
    java.util.Set<org.monospark.spongematchers.parser.element.StringElementParser> baseParsers = com.google.common.collect.Sets.newLinkedHashSet();
    baseParsers.add(new org.monospark.spongematchers.parser.element.BaseElementParser(org.monospark.spongematchers.parser.base.BaseMatcherParser.STRING));
    baseParsers.add(new org.monospark.spongematchers.parser.element.BaseElementParser(org.monospark.spongematchers.parser.base.BaseMatcherParser.BOOLEAN));
    baseParsers.add(new org.monospark.spongematchers.parser.element.BaseElementParser(org.monospark.spongematchers.parser.base.BaseMatcherParser.INTEGER));
    baseParsers.add(new org.monospark.spongematchers.parser.element.BaseElementParser(org.monospark.spongematchers.parser.base.BaseMatcherParser.FLOATING_POINT));
    baseParsers.add(new org.monospark.spongematchers.parser.element.EmptyElementParser());
    return baseParsers;
}