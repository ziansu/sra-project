@java.lang.Override
public hu.schonherz.project.admin.service.api.vo.CompanyVo findByDomainAddressContaining(@lombok.NonNull
final java.lang.String source) {
    return hu.schonherz.project.admin.service.mapper.company.CompanyEntityVoMapper.toVo(companyRepository.findByDomainAddressContaining(source));
}