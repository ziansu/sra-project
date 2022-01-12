public static void main(java.lang.String[] args) {
    ru.alee.software.testtask.AppStart.logger.debug("Application start!");
    try {
        ru.alee.software.testtask.model.FileManager fileManager = new ru.alee.software.testtask.model.FileManager("D:\\log\\testfolder");
        ru.alee.software.testtask.view.JFileManager jFileManager = new ru.alee.software.testtask.view.JFileManager(fileManager);
    } catch (ru.alee.software.testtask.exceptions.DirectoryNotExistException e) {
        ru.alee.software.testtask.AppStart.logger.debug(("cant open D:\\log\\testfolder" + e));
    }
}