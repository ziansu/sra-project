public void setLabelString(java.lang.String label_string) {
    if ((label_ids) == null)
        label_ids = new java.util.ArrayList<>();
    
    if ((label_string == null) || (label_string.equals("")))
        return ;
    
    java.lang.String[] labels = label_string.split(";");
    for (java.lang.String label : labels) {
        if (label.equals("")) {
            label_ids.add(java.lang.Integer.valueOf(label));
        }
    }
}