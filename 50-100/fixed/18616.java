private void setFields(java.util.Date start, java.util.Date end, int id) {
    if (id != 0)
        fields.put("id", (id + ""));
    
    if (start != null)
        fields.put("start", ((start.getTime()) + ""));
    
    if (end != null)
        fields.put("end", ((end.getTime()) + ""));
    
}