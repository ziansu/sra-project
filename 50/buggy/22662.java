@java.lang.Override
protected boolean isFormComplete() {
    java.lang.System.out.println("form contains:");
    for (java.lang.Object field : fields.values()) {
        java.lang.System.out.println(field);
        if (field == null)
            return false;
        
    }
    java.lang.System.out.println("-------------");
    return true;
}