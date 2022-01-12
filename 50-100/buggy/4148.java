public static void writeJson(javax.servlet.http.HttpServletResponse res, com.coderyuan.models.ResultModel obj) throws java.io.IOException {
    java.io.PrintWriter writer = res.getWriter();
    if (obj.getRawOutput()) {
        writer.write(obj.getMsg().toString());
    }else {
        res.setContentType("application/json;\tcharset=utf-8");
        res.setCharacterEncoding("utf-8");
        writer.write(com.coderyuan.utils.JsonUtil.toJson(obj));
    }
}