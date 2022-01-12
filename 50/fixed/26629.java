@java.lang.Override
public java.lang.Object getValueAt(int row, int col) {
    edu.stanford.protege.metaproject.api.Project project = remoteProjects.get(row);
    return project.getName().get();
}