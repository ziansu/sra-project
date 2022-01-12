@org.springframework.web.bind.annotation.RequestMapping(value = "/list/{contentCategoryId}")
@org.springframework.web.bind.annotation.ResponseBody
public com.taotao.pojo.TaotaoResult getContentByCategoryId(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long contentCategoryId) {
    try {
        java.util.List<com.taotao.pojo.TbContent> resultList;
        resultList = contentService.getContentByCategoryId(contentCategoryId);
        return com.taotao.pojo.TaotaoResult.ok(resultList);
    } catch (java.lang.Exception e) {
        return com.taotao.pojo.TaotaoResult.build(500, com.taotao.util.ExceptionUtil.getStackTrace(e));
    }
}