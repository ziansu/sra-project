public void storeTo(java.lang.String jsonName) {
    com.done.storage.JSONStorage jsonPref = com.done.storage.JSONStorage.getInstance();
    jsonPref.setJsonNameToPref(jsonName);
}