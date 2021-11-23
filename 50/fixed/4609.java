public void addProject(com.example.a21corp.vinca.elements.Container element) {
    int index = workspace.projects.size();
    index = (workspace.projects.contains(element)) ? index : index - 1;
    addProject(element, index);
}