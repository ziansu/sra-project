public tomdrever.timetable.data.Timetable load(java.lang.String name) {
    try {
        return tomdrever.timetable.utils.TimetableFileManager.gson.fromJson(tomdrever.timetable.utils.FileUtils.readFile(directory, name), tomdrever.timetable.data.Timetable.class);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        android.widget.Toast.makeText(context, ("Error: Could not read file: " + name), Toast.LENGTH_SHORT).show();
    }
    return null;
}