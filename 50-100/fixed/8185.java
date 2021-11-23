@java.lang.Override
public boolean isFinished(final org.springframework.http.client.ClientHttpResponse response) throws java.io.IOException {
    final com.gooddata.dataset.TaskState taskState = extractData(response, com.gooddata.dataset.TaskState.class);
    if (taskState.isSuccess()) {
        return true;
    }else
        if (!(taskState.isFinished())) {
            return false;
        }
    
    throw new com.gooddata.GoodDataException(((errorMessage + ": ") + (taskState.getMessage())));
}