@org.springframework.web.bind.annotation.RequestMapping(value = "/es/saveEsData/{index}/{type}/{id}")
public org.datasays.wes.demo.model.ActionResult saveEsData(@org.springframework.web.bind.annotation.PathVariable(value = "index")
java.lang.String index, @org.springframework.web.bind.annotation.PathVariable(value = "type")
java.lang.String type, @org.springframework.web.bind.annotation.PathVariable(value = "id", required = false)
java.lang.String id, @org.springframework.web.bind.annotation.RequestBody
java.lang.Object doc) {
    org.datasays.wes.demo.model.ActionResult result = new org.datasays.wes.demo.model.ActionResult();
    try {
        java.lang.Object newdoc = esService.index(index, type, id, doc);
        result.ok(newdoc);
    } catch (java.lang.Exception e) {
        org.datasays.wes.demo.es.actions.EsController.LOG.error(e.getMessage(), e);
        result.error(e);
    }
    return result;
}