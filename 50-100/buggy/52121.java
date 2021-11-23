public boolean deliver(java.lang.String url, java.lang.String content, java.lang.String contentType) {
    boolean success = false;
    int attempt = 1;
    while ((attempt <= (br.com.minone.webhooks.infrastructure.service.IncredibleHookService.TOTAL_ATTEMPTS)) && (!success)) {
        success = post(url, content, contentType);
        if (!success) {
            br.com.minone.webhooks.infrastructure.service.IncredibleHookService.firebaseRepository.post((((url + " >>> Backoff:  ") + ((attempt * attempt) / 1000)) + " seconds"));
            backoff(attempt);
        }
        attempt++;
    } 
    return success;
}