@org.springframework.web.bind.annotation.RequestMapping(value = "/getIvDataWithSn", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object getIvDataWithSn(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    java.lang.String sn = request.getParameter("sn");
    com.mes.pojo.Module mo = moSer.getBySn(sn);
    if (null == mo)
        return new com.mes.pojo.ExtReturn(false, "无此条码");
    
    java.lang.String line = mo.getLine();
    com.mes.pojo.IvData ivData = ivSer.getIvData(sn, line);
    return new com.mes.pojo.ExtReturn(true, "操作成功", ivData);
}