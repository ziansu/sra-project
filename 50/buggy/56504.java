private boolean isValidId(com.hida.model.Pid pid) {
    com.hida.service.MinterServiceImpl.Logger.info("in isValidId");
    com.hida.model.Pid entity = this.PidDao.findByName(pid.getName());
    return entity != null;
}