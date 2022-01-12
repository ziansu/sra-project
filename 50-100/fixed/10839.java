@java.lang.Override
public void doCommand(java.lang.String[] args) {
    if ((args.length) != 1) {
        view.printErrorMessage(new java.lang.String[]{ "Arguments Error" , "Please enter Directory location" });
        return ;
    }
    java.lang.String paths = args[0];
    java.io.File folderPath = null;
    java.lang.String[] filelist;
    try {
        folderPath = new java.io.File(paths);
        filelist = folderPath.list();
        view.printAnswers(filelist);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}