@javafx.fxml.FXML
public void loadDataFromDB() {
    java.util.List<backend.model.PDF> dbData = new java.util.ArrayList<backend.model.PDF>();
    dbData = backend.repository.DAOFactory.getInstance().getPDFDAO().getAllPDFs();
    common.PDFContainer.lds = new backend.weka.LearningDataSet();
    PDFContainer.lds.addAllPDF(new backend.model.PDF[dbData.size()]);
    PDFContainer.lds.write();
    isDataSetLoaded = true;
}