public void mkDir(java.lang.String UserId) {
    java.io.File dir = new java.io.File(((EmployeeManager.Server.path) + UserId));
    if (!(dir.exists()))
        try {
            dir.mkdir();
        } catch (java.lang.Exception e) {
            java.lang.System.out.println(e.getMessage());
        }
    
}