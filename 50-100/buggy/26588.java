public boolean saveCompositionAsNew(proj10BeckChanceRemondiSalerno.Composition composition) throws javax.xml.bind.JAXBException {
    java.io.File file = xmlFileChooser.showSaveDialog(proj10BeckChanceRemondiSalerno.Main.getPrimaryStage());
    marshaller.marshal(composition, file);
    currentSavePath = java.util.Optional.of(file.getAbsolutePath());
    proj10BeckChanceRemondiSalerno.Main.setPrimaryStageTitle(file.getName());
    return currentSavePath.isPresent();
}