public static long getFileSize(edu.isi.pegasus.planner.classes.PegasusFile file) {
    if ((edu.isi.pegasus.planner.refiner.cleanup.constraint.Utilities.sizes) == null) {
        long fileSize = ((long) (file.getSize()));
        return fileSize == (-1) ? edu.isi.pegasus.planner.refiner.cleanup.constraint.Utilities.DEFAULT_FILE_SIZE : fileSize;
    }
    return edu.isi.pegasus.planner.refiner.cleanup.constraint.Utilities.sizes.get(file.getLFN());
}