@java.lang.Override
public void onVideosChosen(java.util.List<com.kbeanie.multipicker.api.entity.ChosenVideo> list) {
    java.util.List<java.lang.String> filePathList = new java.util.ArrayList<java.lang.String>();
    for (com.kbeanie.multipicker.api.entity.ChosenVideo a_chosen : list) {
        java.lang.String temp = a_chosen.toString();
        java.lang.String[] tempList = temp.split(",");
        java.lang.String path = tempList[2].substring(16);
        filePathList.add(path);
    }
    android.util.Log.d("Path List", ("Path List is:" + (filePathList.toString())));
    doMp4Append(filePathList);
}