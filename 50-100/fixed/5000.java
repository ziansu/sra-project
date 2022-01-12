public ninja.Result updateOrganization(ninja.Context context, @ninja.validation.JSR303Validation
vo.OrganizationVO organizationVO, ninja.validation.Validation validationd) {
    organizationVO.setId(organizationId);
    models.Organization organization = userService.updateOrganization(organizationVO);
    vo.ResultVO resultVO = new vo.ResultVO();
    resultVO.setRedirect("/admin");
    ninja.session.FlashScope flashScope = context.getFlashScope();
    flashScope.success("organization.updateSuccessful");
    return ninja.Results.json().render(resultVO);
}