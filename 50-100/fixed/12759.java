@java.lang.Override
protected void onPostExecute(java.lang.String status) {
    java.lang.String imagePath = ((localstoragehandler.fileCacheFolder) + "/") + (filename);
    if (status.equals("OK")) {
        if (type.equals(MessageInfo.MessageType.IMAGE)) {
            at.vcity.androidim.tools.BitmapLoaderTask task = new at.vcity.androidim.tools.BitmapLoaderTask(imageView);
            task.execute(imagePath);
            imageView.setLayoutParams(params);
        }
    }else {
    }
}