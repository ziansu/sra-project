public int modifyField(java.lang.String field, java.lang.String[] value) {
    if ((field != null) && (value != null)) {
        try {
            it.ispw.efco.nottitranquille.controller.AccessController.modifyField(field, value, getUser().getId());
            if (field.equals("password"))
                this.password = value[1];
            
            java.lang.System.out.println(password);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    return 0;
}