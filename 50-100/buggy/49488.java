public void loadData(java.util.Properties prop) {
    com.esgyn.dataloader.ISource source = new com.esgyn.dataloader.impl.SourceImpl();
    java.util.List<java.lang.Object> list = null;
    switch (direction) {
        case "DB2DB" :
            list = source.readFromDBToDB(prop);
            com.esgyn.dataloader.ITarget target = new com.esgyn.dataloader.impl.TargetImpl();
            target.WriteTargetToDBFromDB(list);
            break;
        case "DB2File" :
            break;
        case "File2File" :
            break;
    }
}