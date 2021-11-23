@java.lang.Override
public com.cimat.meetme.entity.Images upload(com.cimat.meetme.entity.Images images) {
    com.cimat.meetme.service.implementation.FileManagementService.log.info("Service");
    return genericDao.create(images);
}