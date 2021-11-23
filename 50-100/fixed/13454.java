public tomdrever.timetable.data.Timetable load(java.lang.String fileName) {
    try {
        return tomdrever.timetable.utils.TimetableFileManager.gson.fromJson(tomdrever.timetable.utils.FileUtils.readFile(directory, fileName), tomdrever.timetable.data.Timetable.class);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        android.widget.Toast.makeText(context, ("Error: Could not read file: " + fileName), Toast.LENGTH_SHORT).show();
    }
    return null;
}