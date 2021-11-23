@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
public void save(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
T entity) throws pl.pamsoft.ebs.error.BadRequestException {
    if (null != (entity.getId())) {
        throw new pl.pamsoft.ebs.error.BadRequestException("Id must be null");
    }
    repository.save(entity);
}