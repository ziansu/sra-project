public boolean openMatrix(java.nio.file.Path file, org.jebtk.math.matrix.AnnotationMatrix m) {
    boolean status = false;
    if (m != null) {
        openMatrix(m);
        status = true;
    }
    if (status) {
        mFilesModel.add(file);
        setSubTitle(org.jebtk.core.io.PathUtils.getName(file));
    }
    return status;
}