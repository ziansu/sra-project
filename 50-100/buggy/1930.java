@com.rapids.manage.controller.RequestMapping(value = "/delAdmin")
public com.rapids.manage.dto.ExtStatusEntity delAdminRole(@com.rapids.manage.controller.RequestParam(value = "id")
int id) {
    com.rapids.manage.dto.ExtStatusEntity entity = new com.rapids.manage.dto.ExtStatusEntity();
    try {
        this.adminService.delAdmin(((long) (id)));
        entity.setMsg("succeed");
        entity.setSuccess(true);
    } catch (java.lang.Exception ex) {
        com.rapids.manage.controller.AdminController.LOGGER.error("delAdmin error", ex);
        entity.setMsg("删除失败");
        entity.setSuccess(false);
    }
    com.rapids.manage.controller.AdminController.LOGGER.info("delAdmin");
    return entity;
}