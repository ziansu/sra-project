protected <T> org.springframework.http.ResponseEntity<T> runWithTokenRetry(org.openlmis.requisition.service.BaseCommunicationService.HttpTask<T> task) {
    try {
        return task.run();
    } catch (org.springframework.web.client.HttpStatusCodeException ex) {
        if ((org.springframework.http.HttpStatus.UNAUTHORIZED) == (ex.getStatusCode())) {
            authService.clearTokenCache();
            return task.run();
        }
        throw ex;
    }
}