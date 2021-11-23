@org.springframework.web.bind.annotation.RequestMapping(value = "/checkNVCLAnalyticalJobStatus.do")
public java.util.List<org.auscope.nvcl.server.vo.AnalyticalJobStatusVo> checkNVCLJobStatus(@org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email) throws java.io.IOException, javax.servlet.ServletException {
    org.auscope.nvcl.server.service.NVCLAnalyticalQueueBrowser nvclAnalyticalQueueBrowser = new org.auscope.nvcl.server.service.NVCLAnalyticalQueueBrowser();
    nvclAnalyticalQueueBrowser.setJmsTemplate(jmsTemplate);
    java.util.List<org.auscope.nvcl.server.vo.AnalyticalJobStatusVo> jobStatusList = ((java.util.ArrayList<org.auscope.nvcl.server.vo.AnalyticalJobStatusVo>) (nvclAnalyticalQueueBrowser.browseQueueStatus(email, nvclStatusDestination)));
    return jobStatusList;
}