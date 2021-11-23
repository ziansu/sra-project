public void marshall(com.helpme.app.model.level.ILevel level, com.helpme.app.model.body.IBody player, com.helpme.app.model.consciousness.IConsciousness[] enemies, java.lang.String filePath) throws javax.xml.bind.JAXBException {
    marshall(new com.helpme.app.saveload.SaveRoot(level, player, enemies), filePath);
}