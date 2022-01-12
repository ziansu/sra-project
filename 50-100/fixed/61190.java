@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String inputrequest = resume.ranker.files.util.ResumeRankerUtils.inputstreamToJSON(request.getInputStream());
    java.lang.System.out.println(java.lang.String.format(POSTRequest, "RegisterServlet", inputrequest));
    resume.ranker.model.JobProfileConfiguration configurationDetails = mapper.readValue(inputrequest, resume.ranker.model.JobProfileConfiguration.class);
    resume.ranker.service.SaveConfigurationService saveConfigurationService = new resume.ranker.service.SaveConfigurationService();
    boolean result = saveConfigurationService.save(configurationDetails);
    if (result)
        response.setStatus(HttpServletResponse.SC_OK);
    else
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
    
}