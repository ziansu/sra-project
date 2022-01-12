private gov.gsa.dcoi.dto.DataCenterDto copyEntityToDto(gov.gsa.dcoi.entity.DataCenterQuarter dataCenterQuarterEntity, gov.gsa.dcoi.entity.DataCenter dataCenterEntity, gov.gsa.dcoi.dto.DataCenterDto dataCenterDto) {
    org.springframework.beans.BeanUtils.copyProperties(dataCenterEntity, dataCenterDto);
    gov.gsa.dcoi.dto.GeneralInformationDto generalInformationDto = new gov.gsa.dcoi.dto.GeneralInformationDto();
    org.springframework.beans.BeanUtils.copyProperties(dataCenterEntity, generalInformationDto);
    generalInformationDto.setPublishedName(dataCenterQuarterEntity.getPublishedName());
    dataCenterDto.setGeneralInfo(generalInformationDto);
    gov.gsa.dcoi.dto.StatusDto statusDto = new gov.gsa.dcoi.dto.StatusDto();
    org.springframework.beans.BeanUtils.copyProperties(statusDto, dataCenterQuarterEntity);
    dataCenterDto.setStatus(statusDto);
    org.springframework.beans.BeanUtils.copyProperties(dataCenterQuarterEntity, dataCenterDto);
    return dataCenterDto;
}