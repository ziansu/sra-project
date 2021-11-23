private void exportToMP3() {
    if (hasPermission) {
        com.team_red.melody.filemanager.MelodyExporter melodyExporter = new com.team_red.melody.filemanager.MelodyExporter(this);
        java.util.ArrayList<java.lang.Integer> sound1 = com.team_red.melody.filemanager.MelodyFileManager.getManager().getResIDOfMusic(com.team_red.melody.filemanager.MelodyFileManager.getManager().MakeNotesFromString(melodyAdapter.getMelodyStringList1(), com.team_red.melody.models.MelodyStatics.FLAG_EXPORT));
        melodyExporter.setSound1(sound1);
        melodyExporter.mergeSongs(currentComposition);
    }else {
        requestPermission();
    }
}