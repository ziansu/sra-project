@org.springframework.web.bind.annotation.RequestMapping(value = "/list", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.kanuhasu.ap.business.bo.job.ClientEntity> list() {
    java.util.List<com.kanuhasu.ap.business.bo.job.ClientEntity> list = clientService.list(com.kanuhasu.ap.business.bo.job.ClientEntity.class);
    return list;
}