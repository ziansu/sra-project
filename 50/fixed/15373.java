private void outProResult(com.seekersoftvendingapp.util.TakeOutError takeOutError) {
    if (takeOutError.isSuccess()) {
        cmdBufferVendingSerial("");
    }else {
        et_getcard.setText("");
        handleResult(takeOutError);
    }
}