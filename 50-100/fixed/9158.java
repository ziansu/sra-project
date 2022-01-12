public static void checkFetchItemsExist(final java.util.List<gov.loc.repository.bagit.domain.FetchItem> items, final java.nio.file.Path bagDir) throws gov.loc.repository.bagit.exceptions.FileNotInPayloadDirectoryException {
    gov.loc.repository.bagit.verify.MandatoryVerifier.logger.info("Checking if all [{}] items in fetch.txt exist in the [{}]", items.size(), bagDir);
    for (final gov.loc.repository.bagit.domain.FetchItem item : items) {
        if (!(java.nio.file.Files.exists(item.path))) {
            throw new gov.loc.repository.bagit.exceptions.FileNotInPayloadDirectoryException((("Fetch item " + item) + " has not been fetched!"));
        }
    }
}