private void checkUserFileBufferBytes() {
    if (!(this.containsKey(Constants.USER_FILE_BUFFER_BYTES))) {
        return ;
    }
    long usrFileBufferBytes = getBytes(Constants.USER_FILE_BUFFER_BYTES);
    com.google.common.base.Preconditions.checkArgument(((usrFileBufferBytes & (java.lang.Integer.MAX_VALUE)) == usrFileBufferBytes), ((("Invalid \"" + (tachyon.Constants.USER_FILE_BUFFER_BYTES)) + "\": ") + usrFileBufferBytes));
}