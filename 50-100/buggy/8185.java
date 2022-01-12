@java.lang.Override
public boolean isFinished(final org.springframework.http.client.ClientHttpResponse response) throws java.io.IOException {
    if (!(super.isFinished(response))) {
        return false;
    }
    final com.gooddata.dataset.TaskState taskState = extractData(response, com.gooddata.dataset.TaskState.class);
    if (taskState.isSuccess()) {
        return true;
    }
    throw new com.gooddata.GoodDataException(((errorMessage + ": ") + (taskState.getMessage())));
}