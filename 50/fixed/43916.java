protected int getResult(final android.content.Intent response) {
    return response.getIntExtra(DConnectMessage.EXTRA_RESULT, DConnectMessage.RESULT_ERROR);
}