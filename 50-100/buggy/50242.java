@java.lang.Override
@javax.transaction.Transactional
public com.hska.localgram.model.Image addImage(com.hska.localgram.model.Image newImage) {
    com.hska.localgram.model.Image image = getImageByFileNameAndUser(newImage.getFile_name(), newImage.getOwner());
    image.addTagSet(newImage.getTag_list());
    try {
        getCurrentSession().merge(image);
    } catch (java.lang.Exception e) {
    }
    return image;
}