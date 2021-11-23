@java.lang.Override
public java.lang.StringBuilder getProjectCSV(model.project.Project project) throws java.rmi.RemoteException {
    server.core.ExportCSV csv = new server.core.ExportCSV(calculateProject(project));
    csv.ExportFile();
    return csv.ExportFile();
}