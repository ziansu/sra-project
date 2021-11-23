@org.springframework.web.bind.annotation.RequestMapping(value = "/suggest", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { "application/json" })
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<net.hunnor.dict.model.Autocomplete> suggest(@org.springframework.web.bind.annotation.RequestParam(value = "term", required = false)
java.lang.String term) {
    java.util.List<net.hunnor.dict.model.Autocomplete> result = null;
    try {
        result = searchService.suggest(term, 10);
    } catch (net.hunnor.dict.model.SearchException e) {
        net.hunnor.dict.web.ApiController.LOGGER.error(e.getMessage(), e);
    }
    return result;
}