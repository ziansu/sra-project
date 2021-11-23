@org.springframework.web.bind.annotation.RequestMapping(value = "/{announcementId}/delete", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json; charset=utf-8")
public java.lang.String deleteAnnouncement(@org.springframework.web.bind.annotation.PathVariable(value = "announcementId")
java.lang.Long announcementId) throws com.fasterxml.jackson.core.JsonProcessingException, gov.healthit.chpl.auth.user.UserRetrievalException, gov.healthit.chpl.dao.EntityCreationException, gov.healthit.chpl.dao.EntityRetrievalException {
    gov.healthit.chpl.dto.AnnouncementDTO toDelete = announcementManager.getById(announcementId);
    announcementManager.delete(toDelete);
    return "{\"deletedAnnouncement\" : true }";
}