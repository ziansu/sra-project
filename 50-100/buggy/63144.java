@org.springframework.web.bind.annotation.RequestMapping(value = "/getIvData", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object getIvData(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    java.lang.String sn = request.getParameter("sn");
    java.lang.String line = request.getParameter("line");
    com.mes.DB.DynamicDataSourceHolder.setDataSource(("ds_iv" + line));
    com.mes.pojo.IvData ivData = ivSer.getIvData(sn, line);
    com.mes.DB.DynamicDataSourceHolder.setDataSource("ds_mysql");
    return new com.mes.pojo.ExtReturn(true, "操作成功", ivData);
}