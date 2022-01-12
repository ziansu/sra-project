private static eu.itesla_project.ucte.network.UcteNodeCode parseNodeCode(eu.itesla_project.ucte.network.io.UcteRecordParser parser, int beginIndex) {
    eu.itesla_project.ucte.network.UcteCountryCode ucteCountryCode = eu.itesla_project.ucte.network.UcteCountryCode.fromUcteCode(parser.parseChar(beginIndex));
    java.lang.String geographicalSpot = parser.parseString((beginIndex + 1), (beginIndex + 6));
    eu.itesla_project.ucte.network.UcteVoltageLevelCode voltageLevelCode = parser.parseEnumOrdinal((beginIndex + 6), eu.itesla_project.ucte.network.UcteVoltageLevelCode.class);
    java.lang.Character busbar = parser.parseChar((beginIndex + 7));
    return new eu.itesla_project.ucte.network.UcteNodeCode(ucteCountryCode, geographicalSpot, voltageLevelCode, busbar);
}