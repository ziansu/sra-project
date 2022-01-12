public static void printError(java.lang.String msg) {
    if ((edu.nmt.cocoeditor.CoCoEditor.lastOut) != null)
        edu.nmt.cocoeditor.CoCoEditor.lastOut.println(("Encountered error: " + msg));
    
}