public static DataBase_DevelopmentReports.API.DaemonThread getInstance(java.lang.String listeningPath, DataBase_DevelopmentReports.API.csvToDatabase csv) {
    if ((DataBase_DevelopmentReports.API.DaemonThread.dt) == null) {
        DataBase_DevelopmentReports.API.DaemonThread.dt = new DataBase_DevelopmentReports.API.DaemonThread(listeningPath, csv);
    }
    return DataBase_DevelopmentReports.API.DaemonThread.dt;
}