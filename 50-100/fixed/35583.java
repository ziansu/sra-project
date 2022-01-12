@org.springframework.web.bind.annotation.RequestMapping(value = "/emp/myview/buildProjectDesc/getSubAliasProject.do", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getSubAliasProject(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.lang.System.out.println(request.getParameter("aliasProjectName"));
    java.util.Map<java.lang.String, java.lang.String> subAliasProjectList = populateSubAliasProjectList(request.getParameter("aliasProjectName"));
    java.lang.System.out.println(subAliasProjectList.size());
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String subAliasProjectJson = gson.toJson(subAliasProjectList);
    java.lang.System.out.println(subAliasProjectJson);
    return subAliasProjectJson;
}