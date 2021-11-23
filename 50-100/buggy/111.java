public void setResult(boolean status, java.lang.String nameOfTest, java.lang.Long duration) throws java.io.IOException, java.net.MalformedURLException {
    java.lang.String result = ((nameOfTest + "[") + (status ? "PASS" : "FAIL")) + "]";
    if (duration != null) {
        insynctive.utils.TestResults.addResult((((result + " (Duration: ") + (duration / 1000000)) + " ms)"));
    }else {
        insynctive.utils.TestResults.addResult(result);
    }
    if (status == false) {
        generalStatus = status;
    }
    tags.add(result);
}