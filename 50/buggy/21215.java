java.lang.String getTaskJSON(br.com.kdev.task.Task task) {
    java.lang.String data = "";
    try {
        data = mapper.writeValueAsString(task);
    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
        e.printStackTrace();
    }
    return data;
}