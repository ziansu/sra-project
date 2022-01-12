private void outProResult(com.seekersoftvendingapp.util.TakeOutError takeOutError) {
    if (takeOutError.isSuccess()) {
        cmdBufferStoreSerial("");
    }else {
        handleResult(takeOutError);
    }
}