private void setDeveloperDto(by.training.nc.dev5.service.DeveloperDto dto, by.training.nc.dev5.service.Developer entity) {
    by.training.nc.dev5.service.Project project = projectDao.getProjectByDeveloper(entity.getId());
    by.training.nc.dev5.service.ProjectDto projectDto = null;
    by.training.nc.dev5.service.QualificationDto qualificationDto = new by.training.nc.dev5.service.QualificationDto();
    if (project != null) {
        projectDto = new by.training.nc.dev5.service.ProjectDto();
        projectDto.setId(project.getId());
    }
    dto.setProject(projectDto);
    qualificationDto.setId(entity.getQualification().getId());
    dto.setQualification(qualificationDto);
}