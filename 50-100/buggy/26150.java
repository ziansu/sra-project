@java.lang.Override
public nikita.model.noark5.v4.BasicRecord createBasicRecordAssociatedWithFile(java.lang.String fileSystemId, nikita.model.noark5.v4.BasicRecord basicRecord) {
    nikita.model.noark5.v4.BasicRecord persistedBasicRecord = null;
    nikita.model.noark5.v4.File file = fileRepository.findBySystemId(fileSystemId);
    if (file == null) {
        java.lang.String info = ((nikita.config.Constants.INFO_CANNOT_FIND_OBJECT) + " File, using fileSystemId ") + fileSystemId;
        no.arkivlab.hioa.nikita.webapp.service.impl.imprt.FileImportService.logger.info(info);
        throw new no.arkivlab.hioa.nikita.webapp.util.exceptions.NoarkEntityNotFoundException(info);
    }else {
        basicRecord.setReferenceFile(file);
        persistedBasicRecord = ((nikita.model.noark5.v4.BasicRecord) (recordImportService.save(((nikita.model.noark5.v4.Record) (basicRecord)))));
    }
    return persistedBasicRecord;
}