public static java.lang.String getAddress() throws java.io.IOException {
    AlreadyWrittenChecker.addressCache = "";
    AlreadyWrittenChecker.addressCache = AlreadyWrittenChecker.alreadyWrittenReader.next();
    return AlreadyWrittenChecker.addressCache;
}