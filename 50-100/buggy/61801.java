private java.lang.String insertTasks(java.util.List<java.lang.String> taskList) {
    java.lang.String query = "INSERT INTO task_manager " + ("(task_manager_task_id, task_manager_inputs, task_manager_outputs, task_manager_crontab_line," + "task_manager_station_id, task_manager_name, task_manager_pass_inputs_as_io_id) values ");
    for (java.lang.String value : taskList) {
        query += value + ",";
    }
    query = (query.substring(0, ((query.length()) - 1))) + ";";
    db = new Creator.DBConn();
    java.lang.String returnString = db.executeQuery(query);
    db.closeConn();
    return returnString;
}