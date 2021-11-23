public void get(java.lang.String variable) {
    if ((variables) != null) {
        if (variables.containsKey(variable))
            java.lang.System.out.println(variable);
        else
            java.lang.System.out.println("NULL");
        
    }else
        printErrorMessage();
    
}