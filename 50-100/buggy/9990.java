@org.junit.Test
public void get_GivenUnknownIdShouldReturnNotFoundStatus() throws com.nextlunch.api.service.exception.ReadException {
    org.mockito.Mockito.when(service.getWinnerOfDay(org.mockito.Matchers.any(java.util.Date.class))).thenThrow(new com.nextlunch.api.service.exception.ReadException(com.nextlunch.api.service.exception.enums.ReadExceptionMessageEnum.NOT_FOUND));
    @java.lang.SuppressWarnings(value = "rawtypes")
    org.springframework.http.ResponseEntity responseEntity = controller.getWinnerOfDay();
    org.springframework.http.HttpStatus httpStatus = responseEntity.getStatusCode();
    org.hamcrest.MatcherAssert.assertThat("Wrong HTTP status for unknown ID", httpStatus, org.hamcrest.Matchers.equalTo(HttpStatus.NOT_FOUND));
    org.mockito.Mockito.verify(service, org.mockito.Mockito.times(1)).getWinnerOfDay(day);
}