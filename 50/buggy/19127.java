@java.lang.Override
public gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.IGDocument save(gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.IGDocument ig) throws gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.IGDocumentException {
    try {
        save(ig, gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.util.DateUtils.getCurrentDate());
        return documentRepository.save(ig);
    } catch (com.mongodb.MongoException e) {
        throw new gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.IGDocumentException(e);
    }
}