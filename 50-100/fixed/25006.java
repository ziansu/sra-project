public void onSuccess(com.datastax.example.ResultSet result) {
    context.stop();
    readSuccess.mark();
    if ((result.getAvailableWithoutFetching()) > 0) {
        readFull.mark();
    }else {
        readEmpty.mark();
    }
}