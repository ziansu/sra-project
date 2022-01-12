private void transposeVoToEntity(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
hu.transferwise.phonebookapi.controller.vo.ContactDetailVO contactDetailVO, hu.transferwise.phonebookapi.entity.ContactDetail contactDetail) {
    contactDetail.setName(contactDetailVO.getName());
    contactDetail.setCompany(contactDetailVO.getCompany());
    contactDetail.setJobTitle(contactDetailVO.getJobTitle());
    contactDetail.setEmail(contactDetailVO.getEmail());
    contactDetail.setNotes(contactDetailVO.getNotes());
    contactDetail.setPhone(contactDetailVO.getPhone());
}