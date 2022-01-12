@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public void saveAbout(java.lang.String projectId, java.lang.String title, java.lang.String description) {
    edu.asu.spring.quadriga.dto.AboutTextDTO aboutTextDTO = aboutTextDAO.getDTOByProjectId(projectId);
    aboutTextDTO.setProjectId(projectId);
    aboutTextDTO.setTitle(title);
    aboutTextDTO.setDescription(description);
    aboutTextDAO.saveNewDTO(aboutTextDTO);
}