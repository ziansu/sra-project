public static java.lang.String createSession() {
    java.lang.String id = edu.nmt.cocoeditor.CoCoEditor.generateKey(edu.nmt.cocoeditor.CoCoEditor.KEY_SESSION_LENGTH);
    int i = 0;
    while (edu.nmt.cocoeditor.DatabaseStatus.instance().hasSession(id)) {
        if (i > (edu.nmt.cocoeditor.CoCoEditor.KEY_FETCH_TIMEOUT)) {
            edu.nmt.cocoeditor.CoCoEditor.printError("Failed to generate unique session key in time");
            return null;
        }
        id = edu.nmt.cocoeditor.CoCoEditor.generateKey(edu.nmt.cocoeditor.CoCoEditor.KEY_SESSION_LENGTH);
        i++;
    } 
    java.lang.System.out.println(("here with id: " + id));
    edu.nmt.cocoeditor.CoCoEditor.instance().addSession(id);
    return id;
}