private static org.roda_project.commons_ip.model.AIP parseEARKAIP(final java.nio.file.Path source, final java.nio.file.Path destinationDirectory) throws org.roda_project.commons_ip.model.ParseException {
    java.nio.file.Path aipPath = org.roda_project.commons_ip.utils.ZIPUtils.extractIPIfInZipFormat(source, destinationDirectory, org.roda_project.commons_ip.model.impl.eark.EARKAIP.FILE_EXTENSION);
    return org.roda_project.commons_ip.model.impl.eark.EARKAIP.parseEARKAIPFromPath(aipPath);
}