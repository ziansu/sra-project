public void onSuccess(com.datastax.example.ResultSet result) {
    context.stop();
    readSuccess.mark();
    com.datastax.example.Row row = result.one();
    if ((result.getAvailableWithoutFetching()) > 0) {
        readFull.mark();
    }else {
        readEmpty.mark();
    }
}