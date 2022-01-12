@org.springframework.web.bind.annotation.RequestMapping(value = "/es/saveEsData")
public org.datasays.wes.demo.model.ActionResult saveEsData(@org.springframework.web.bind.annotation.RequestBody
org.datasays.wes.vo.EsItem doc) {
    org.datasays.wes.demo.model.ActionResult result = new org.datasays.wes.demo.model.ActionResult();
    try {
        org.datasays.wes.vo.EsItem newdoc = esService.save(doc);
        result.ok(newdoc);
    } catch (java.lang.Exception e) {
        org.datasays.wes.demo.es.actions.EsController.LOG.error(e.getMessage(), e);
        result.error(e);
    }
    return result;
}