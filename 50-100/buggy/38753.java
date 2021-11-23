public static void NewDir(java.util.ArrayList<java.lang.String> options) {
    java.lang.String name = "";
    for (java.lang.String option : options) {
        if (option.equals("-h")) {
            java.lang.System.out.println("Command syntax:\n\tmd [-h] name\n\nCreates a new directory.");
            return ;
        }else
            name += option + " ";
        
    }
    name.trim();
    name = (JTerm.currentDirectory) + name;
    java.io.File dir = new java.io.File(name);
    dir.mkdir();
}