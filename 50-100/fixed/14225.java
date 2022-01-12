@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void getNewsImage(int id, java.io.OutputStream stream) throws java.lang.Exception {
    if (!(newsAvailabilityService.isAvailable(newsService.get(id)))) {
        throw new com.nextbook.services.impl.NoSuchEntityException("news", java.lang.String.format("id %d", id));
    }
    getBlobByName(getNewsContainer().getDirectoryReference(((com.nextbook.services.impl.StorageProvider.NEWS_FOLDER_ID) + id)), (id + ""), stream);
}