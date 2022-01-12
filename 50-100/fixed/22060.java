private void process(java.io.File file, java.net.URL dest, boolean expectContinue) throws java.lang.Exception {
    log(((((("putting " + file) + " to ") + dest) + " with expectContinue=") + expectContinue), Project.MSG_VERBOSE);
    getSardine().put(dest.toString(), file, fContentType, expectContinue);
}