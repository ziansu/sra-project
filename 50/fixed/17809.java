public static void addOpenedFile(org.nschmidt.ldparteditor.data.DatFile file) {
    org.nschmidt.ldparteditor.project.Project.openedFiles.remove(file);
    org.nschmidt.ldparteditor.project.Project.openedFiles.add(file);
}