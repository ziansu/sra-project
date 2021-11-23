@java.lang.Override
public void run() {
    com.google.gson.JsonObject filteredLog = applyFilters(jsonLog);
    storage.insert(type(), filteredLog);
}