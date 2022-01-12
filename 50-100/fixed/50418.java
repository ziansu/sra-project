@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getCreateData() {
    java.util.HashMap<java.lang.String, java.lang.Object> data = new java.util.HashMap<java.lang.String, java.lang.Object>();
    if ((createData) != null) {
        data.put("value", createData);
    }else
        if ((value) != null) {
            data.put("value", value.getId());
        }else {
            data = null;
        }
    
    return data;
}