public void detect_minmax(java.lang.String str) {
    if (str.substring(0, 3).toLowerCase().equals("min"))
        minmax = -1;
    else
        if (str.substring(0, 3).toLowerCase().equals("max"))
            minmax = 1;
        else {
            java.lang.System.out.println("Please specify the type of the linear problem");
            java.lang.System.exit(1);
        }
    
}