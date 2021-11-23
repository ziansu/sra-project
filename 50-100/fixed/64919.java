@javafx.fxml.FXML
public void click_MakeLicence(javafx.event.ActionEvent actionEvent) {
    setStatus(ru.dmitrii.kulik.license.Controller.mBegin);
    java.lang.String tmp = createLicence(start_dir, selected_FILE);
    logger.info("MAKE : TRY MAKE LICENCE FILE.");
    if (!(tmp.equals(""))) {
        runProcess(tmp);
        logger.info("MAKE : CHECK START FOLDER.");
    }else {
        logger.severe("MAKE : REQUEST NOT BE FULL! CHECK *HWC FILE");
        setStatus(ru.dmitrii.kulik.license.Controller.mError);
        show_modality_Windows("REQUEST NOT BE FULL! CHECK *HWC FILE");
    }
}