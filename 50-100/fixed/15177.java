@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.data.domain.Page<com.cspinformatique.kubik.server.model.dilicom.DilicomOrder> findAll(@org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.String status, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "0")
java.lang.Integer page, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "50")
java.lang.Integer resultPerPage, @org.springframework.web.bind.annotation.RequestParam(required = false)
org.springframework.data.domain.Sort.Direction direction, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "creationDate")
java.lang.String sortBy) {
    return dilicomOrderService.findAll(new org.springframework.data.domain.PageRequest(page, resultPerPage, (direction != null ? direction : org.springframework.data.domain.Sort.Direction.DESC), sortBy));
}