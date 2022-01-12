private boolean isError400(com.softserveinc.if052_webapp.service.ServiceResponse serviceResponse, org.springframework.http.ResponseEntity<java.lang.String> indicatorResponseEntity) {
    if ((indicatorResponseEntity.getStatusCode().value()) == 400) {
        serviceResponse.setStatus("error400");
        serviceResponse.setMessage("Некоректний запит. Будь ласка, перевірте правильність введених даних");
        return true;
    }
    return false;
}