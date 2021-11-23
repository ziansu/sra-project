public void changeCompanyStatus(@lombok.NonNull
final hu.schonherz.project.admin.service.api.vo.CompanyVo companyVo) {
    companyServiceRemote.changeStatus(companyVo.getId());
    init();
    javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
    context.addMessage(null, new javax.faces.application.FacesMessage(localeManagerBean.localize(hu.schonherz.project.admin.web.view.CompaniesView.CHANGING_SUCCESS), ((companyVo.isActive() ? localeManagerBean.localize(hu.schonherz.project.admin.web.view.CompaniesView.INACTIVATE_SUCCESS) : localeManagerBean.localize(hu.schonherz.project.admin.web.view.CompaniesView.ACTIVATE_SUCCESS)) + (companyVo.getCompanyName()))));
}