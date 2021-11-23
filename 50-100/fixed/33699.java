public static org.radarcns.management.service.dto.SubjectDTO createEntityDTO(javax.persistence.EntityManager em) {
    org.radarcns.management.service.dto.SubjectDTO subject = new org.radarcns.management.service.dto.SubjectDTO();
    subject.setExternalLink(org.radarcns.management.web.rest.SubjectResourceIntTest.DEFAULT_EXTERNAL_LINK);
    subject.setExternalId(org.radarcns.management.web.rest.SubjectResourceIntTest.DEFAULT_ENTERNAL_ID);
    subject.setStatus(SubjectDTO.SubjectStatus.ACTIVATED);
    org.radarcns.management.service.dto.ProjectDTO projectDTO = new org.radarcns.management.service.dto.ProjectDTO();
    projectDTO.setId(1L);
    projectDTO.setProjectName("Radar");
    projectDTO.setLocation("SOMEWHERE");
    projectDTO.setDescription("test");
    subject.setProject(projectDTO);
    return subject;
}