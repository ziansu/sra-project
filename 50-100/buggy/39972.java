public static javafx.collections.ObservableList<ahgpoug.objects.Task> checkAllPDFs(javafx.collections.ObservableList<ahgpoug.objects.Task> list) {
    java.util.ArrayList<java.lang.String> PDFs = ahgpoug.dbx.DbxHelper.PDF.getAllPDFs();
    for (ahgpoug.objects.Task task : list) {
        if (PDFs.contains(task.getId().getValue()))
            task.setHasPDF(true);
        else
            task.setHasPDF(false);
        
    }
    return list;
}