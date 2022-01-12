public void delete(final java.lang.Long id) {
    org.openlearn.service.InstructorService.log.debug("Request to delete instructor : {}", id);
    org.openlearn.domain.User instructor = userRepository.findOneByIdAndAuthority(id, org.openlearn.service.InstructorService.INSTRUCTOR);
    if ((instructor.getAddress()) != null)
        addressRepository.delete(instructor.getAddress().getId());
    
    if ((instructor != null) && ((org.openlearn.security.SecurityUtils.isAdmin()) || (inOrgOfCurrentUser(instructor)))) {
        userRepository.delete(id);
    }else {
    }
}