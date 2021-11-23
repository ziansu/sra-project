@org.junit.Test
public void savesNewUserFileToStorageAndRedirectsToWebForm() throws java.lang.Exception {
    eionet.webq.dao.orm.ProjectFile projectFile = new eionet.webq.dao.orm.ProjectFile();
    projectFile.setFileName("webform.xhtml");
    org.mockito.Mockito.when(webFormService.findActiveWebFormById(eionet.webq.web.controller.PublicPageControllerTest.WEB_FORM_ID)).thenReturn(projectFile);
    org.mockito.Mockito.when(webFormService.findWebFormById(eionet.webq.web.controller.PublicPageControllerTest.WEB_FORM_ID)).thenReturn(projectFile);
    publicPageController.startWebFormSaveFile(eionet.webq.web.controller.PublicPageControllerTest.WEB_FORM_ID, new org.springframework.mock.web.MockHttpServletRequest());
    org.mockito.Mockito.verify(userFileService).saveBasedOnWebForm(org.mockito.Matchers.any(eionet.webq.dao.orm.UserFile.class), org.mockito.Matchers.eq(projectFile));
}