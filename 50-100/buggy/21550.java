@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/task/{id}")
@javax.ws.rs.Consumes(value = "application/json")
@javax.ws.rs.Produces(value = "application/json")
public java.lang.String putTask(@javax.ws.rs.PathParam(value = "id")
int id, java.lang.String taskLine) {
    try {
        edu.calvin.cs262.Task task = new com.google.gson.Gson().fromJson(taskLine, edu.calvin.cs262.Task.class);
        task.setId(id);
        java.lang.System.out.println("put");
        return new com.google.gson.Gson().toJson(setTaskComplete(task));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}