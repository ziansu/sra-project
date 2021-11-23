@org.springframework.web.bind.annotation.RequestMapping(value = "/dataGrid", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.wangzhixuan.utils.PageInfo dataGrid(javax.servlet.http.HttpServletRequest request, com.wangzhixuan.vo.AbroadVo abroadVo, java.lang.Integer page, java.lang.Integer rows, java.lang.String sort, java.lang.String order) {
    com.wangzhixuan.utils.PageInfo pageInfo = new com.wangzhixuan.utils.PageInfo(page, rows);
    java.util.Map<java.lang.String, java.lang.Object> condition = com.wangzhixuan.vo.AbroadVo.CreateCondition(abroadVo);
    pageInfo.setCondition(condition);
    abroadService.findDataGrid(pageInfo, request);
    return pageInfo;
}