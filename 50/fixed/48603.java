public static void cloneAndAdd(int indexOfPathIAmCloning, ProjectSahara.Edge edgeIAmAdding) {
    ProjectSahara.Path clone = new ProjectSahara.Path(ProjectSahara.Main.container.get(indexOfPathIAmCloning));
    clone.add(edgeIAmAdding);
    ProjectSahara.Main.container.add(clone);
}