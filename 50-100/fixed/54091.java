@java.lang.Override
public java.util.List<diary.DiaryEntry> read() {
    java.lang.String json = "";
    try {
        json = new java.lang.String(java.nio.file.Files.readAllBytes(impl.FileStore.PATH));
    } catch (java.io.IOException e) {
        return new java.util.ArrayList<>();
    }
    com.google.gson.Gson gson = new com.google.gson.Gson();
    diary.DiaryEntry[] entries = gson.fromJson(json, diary.DiaryEntry[].class);
    return new java.util.ArrayList(java.util.Arrays.asList(entries));
}