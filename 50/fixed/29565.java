public static void setNumberServer(int content) {
    if (content >= 0)
        com.matcracker.PMManagerServers.utility.Utility.writeIntData(new java.io.File((("Data" + (java.io.File.separator)) + "nservers.pm")), content);
    else
        java.lang.System.err.println("Can't set a negative value!");
    
}