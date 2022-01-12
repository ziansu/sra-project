public void onClick(android.content.DialogInterface dialog, int whichButton) {
    android.util.Log.d("LY", "save clicked");
    if ((fileFullName) == null) {
        return ;
    }
    java.util.List<de.mpg.mpdl.labcam.Model.LocalModel.Image> selectedImageList = new java.util.ArrayList<de.mpg.mpdl.labcam.Model.LocalModel.Image>();
    for (java.lang.String imagePath : imagePathArray) {
        de.mpg.mpdl.labcam.Model.LocalModel.Image image = de.mpg.mpdl.labcam.Utils.DBConnector.getImageByPath(imagePath);
        if (image != null) {
            selectedImageList.add(image);
        }
        de.mpg.mpdl.labcam.Utils.DBConnector.batchEditVoice(selectedImageList, fileFullName);
    }
}