public static void main(java.lang.String[] args) {
    if ((args.length) > 0) {
        if (args[0].equalsIgnoreCase("-gui")) {
            diag.stn.GUI.GUIApp gui = new diag.stn.GUI.GUIApp();
        }else
            diag.stn.DiagSTN.readAndProcess(args[0]);
        
    }else {
        java.lang.String out = "";
        boolean ans;
        do {
            ans = diag.stn.DiagSTN.runRandomGen();
        } while (ans );
        java.lang.System.out.println((("Right answer found: " + out) + "\n"));
    }
}