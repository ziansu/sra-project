@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case Constant.RESULT_INPUT_FILE :
            {
                try {
                    audioURL = new java.io.File(data.getData().getPath()).toURI().toURL();
                } catch (java.net.MalformedURLException e) {
                    e.printStackTrace();
                    audioURL = null;
                    android.util.Log.d("InputFileError", "Malformed URL Input file");
                    isFileChosen = true;
                }
                break;
            }
    }
    super.onActivityResult(requestCode, resultCode, data);
}