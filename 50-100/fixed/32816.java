public void changeUserStatus(@lombok.NonNull
final hu.schonherz.project.admin.service.api.vo.UserVo userVo) {
    userServiceRemote.changeStatus(userVo.getId());
    init();
    java.lang.String detailedMessage = (userVo.isActive()) ? localeManager.localize(hu.schonherz.project.admin.web.view.UsersView.INACTIVATE_SUCCESS) : (localeManager.localize(hu.schonherz.project.admin.web.view.UsersView.ACTIVATE_SUCCESS)) + (userVo.getUsername());
    sendMessage(localeManager.localize(hu.schonherz.project.admin.web.view.UsersView.CHANGING_SUCCESS), detailedMessage);
}