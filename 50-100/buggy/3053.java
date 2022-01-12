private static java.io.File getXMLTemplate(pcgen.facade.core.CharacterFacade character) {
    java.io.File template = org.apache.commons.io.FileUtils.getFile(pcgen.system.ConfigurationSettings.getSystemsDir(), "gameModes", character.getDataSet().getGameMode().getName(), "base.xml.ftl");
    if (!(template.exists())) {
        template = new java.io.File(pcgen.system.ConfigurationSettings.getOutputSheetsDir(), "base.xml.ftl");
    }
    return template;
}