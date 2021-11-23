@java.lang.Override
public void insertGoal(java.util.Map<java.lang.String, java.lang.Object> map) throws java.lang.Exception {
    java.lang.String goalCheckPeriod = map.get("goalCheckPeriod").toString();
    java.lang.String has_goal_check_period_value = map.get("has_goal_check_period_value").toString();
    if ("N".equals(has_goal_check_period_value)) {
        if ((goalCheckPeriod == null) || ("".equals(goalCheckPeriod))) {
            map.put("goalCheckPeriod", "0");
        }
    }
    frontDAO.insertGoal(map);
}