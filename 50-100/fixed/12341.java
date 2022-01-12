public static boolean validatePriority(java.lang.String priority) {
    if (priority == null) {
        return false;
    }
    for (model.map.Priority p : model.map.Priority.values()) {
        if (p.toString().equals(priority))
            return true;
        
    }
    return false;
}