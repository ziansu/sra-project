public void queueJSON(java.io.PrintWriter stream) {
    stream.println("{");
    stream.println("\"queue\": [");
    boolean printComma = false;
    for (edu.letu.libprint.QueueItem i : queue) {
        if ((i.status()) == (edu.letu.libprint.QueueItem.Status.Waiting)) {
            stream.println(((printComma ? "," : "") + (i.asJSON())));
            printComma = true;
        }
    }
    stream.println("]");
    stream.println("}");
}