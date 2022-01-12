@org.springframework.web.bind.annotation.RequestMapping(value = "listCategory")
public java.lang.String listCategory(@org.springframework.web.bind.annotation.ModelAttribute
com.cza.service.goods.vo.CategoryVo category, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    com.cza.common.ServiceResponse<java.util.List<com.cza.service.goods.vo.CategoryVo>> resp = categoryService.listCategory(category);
    if (resp.isSuccess()) {
        com.cza.web.login.CategoryAction.log.info("listCategory success,result:{}", resp.getData());
        request.setAttribute("listCategory", resp.getData());
        return webPage("categoryList");
    }else {
        com.cza.web.login.CategoryAction.log.info("listCategory has erro,respCode:{}", resp.getCode());
        return erro(request, resp);
    }
}