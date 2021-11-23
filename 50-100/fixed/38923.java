private void deleteListRecord() {
    for (int i = 0; i < (list.size()); i++) {
        java.io.File file = new java.io.File(((com.alpha.sound_recorder_app.util.Global.PATH) + ((java.lang.String) (list.get(i)))));
        if (file.exists()) {
            file.delete();
        }
    }
    list = null;
}