public java.util.ArrayList<model.project.Project> getProjects() {
    java.util.ArrayList<model.project.Project> list = new java.util.ArrayList<model.project.Project>();
    for (util.serialization.Serializable item : this.serializer.getItems(this)) {
        list.add(((model.project.Project) (item)));
    }
    return list;
}