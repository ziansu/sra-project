@java.lang.Override
public void docheck(java.lang.String inputPath, java.lang.String outputPath, xie.shu.po.History history) {
    manage.Service checkservice = new manage.Service();
    try {
        java.lang.System.out.println("-----------------------------------------------------------------");
        checkservice.checkFile(inputPath, outputPath);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
        return ;
    }
    historyMaqqer.insert(history);
}