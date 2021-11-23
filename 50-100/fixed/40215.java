public void startWriter(java.util.List<ch.ice.model.Customer> enhancedCustomerList) {
    ch.ice.controller.MainController.logger.info("Start writing customers to File");
    try {
        if ((ch.ice.controller.MainController.fileWriterFactory) == true) {
            ch.ice.controller.MainController.fileWriter = ch.ice.controller.file.FileWriterFactory.requestFileWriter(FileWriterFactory.EXCEL);
        }else
            if ((ch.ice.controller.MainController.fileWriterFactory) == false) {
                ch.ice.controller.MainController.fileWriter = ch.ice.controller.file.FileWriterFactory.requestFileWriter(FileWriterFactory.CSV);
            }
        
    } catch (ch.ice.exceptions.FileParserNotAvailableException e) {
        e.printStackTrace();
    }
    try {
        ch.ice.controller.MainController.fileWriter.writeFile(enhancedCustomerList, ch.ice.controller.MainController.fileParser);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}