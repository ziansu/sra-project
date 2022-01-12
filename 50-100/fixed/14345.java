public static void main(java.lang.String[] args) {
    ru.alee.software.testtask.model.FileManager fileManager;
    try {
        if ((args.length) > 0) {
            fileManager = new ru.alee.software.testtask.model.FileManager(args[0]);
        }else {
            fileManager = new ru.alee.software.testtask.model.FileManager();
        }
    } catch (ru.alee.software.testtask.exceptions.DirectoryNotExistException e) {
        fileManager = new ru.alee.software.testtask.model.FileManager();
    }
    ru.alee.software.testtask.view.JFileManager jFileManager = new ru.alee.software.testtask.view.JFileManager(fileManager);
}