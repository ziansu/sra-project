@java.lang.Override
public org.ums.domain.model.dto.library.ImprintDto getImprint() {
    if (((mImprint.getPublisher()) == null) && ((mImprint.getPublisherId()) != 0))
        mImprint.setPublisher(org.ums.persistent.model.library.PersistentRecord.sPublisherManager.get(mImprint.getPublisherId()));
    
    return mImprint;
}