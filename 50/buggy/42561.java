@io.swagger.annotations.ApiOperation(value = "getKinksByKinkster")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.kink.view.KinkWithLevelView> viewKinksByKinkster(@org.springframework.web.bind.annotation.RequestParam(value = "page", required = false)
java.lang.Integer page, @javax.websocket.server.PathParam(value = "id")
java.lang.String id) {
    int pageNo = (page == null) ? 0 : page;
    return kinkDao.getPageOfKinksByKinkster(pageNo, id);
}