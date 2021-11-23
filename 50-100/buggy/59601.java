public void onClick(android.content.DialogInterface dialog, int id) {
    android.widget.Toast.makeText(this, "You clicked Yes", Toast.LENGTH_SHORT).show();
    com.snippet.snippet.controller.DatabaseUtils.setAutoTaggedFromFilePath(this, mFilePath, true);
    com.snippet.snippet.view.ImageViewerActivity.stopwatchStart = java.lang.System.currentTimeMillis();
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.snippet.snippet.controller.adapters.ClarifAIHelper clarifAIHelper = new com.snippet.snippet.controller.adapters.ClarifAIHelper(com.snippet.snippet.view.ImageViewerActivity.this);
            clarifAIHelper.sendToClarifAI(mFilePath, tagListener);
        }
    }).start();
}