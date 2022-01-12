@java.lang.Override
public void run() {
    com.google.gson.JsonObject filteredLog = applyFilters(jsonLog);
    if (filteredLog != null) {
        storage.insert(type(), filteredLog);
    }
}