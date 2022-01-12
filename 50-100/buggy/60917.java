@org.junit.Test
public void setExplainingMessageShouldSetRelevantMessageIfUserIsNotValid() throws java.lang.Exception {
    org.mockito.Mockito.when(by.it.academy.adorop.web.utils.RequestParamValidator.areEmpty(org.mockito.Matchers.anyVararg())).thenReturn(false);
    org.mockito.Mockito.when(userService.isValid(org.mockito.Matchers.anyString(), org.mockito.Matchers.anyString())).thenReturn(false);
    command.setExplainingMessage();
    org.mockito.Mockito.verify(request).setAttribute("message", by.it.academy.adorop.web.commands.INVALID_USER_MESSAGE);
}