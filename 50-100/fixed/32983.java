@java.lang.Override
public void process(java.io.InputStream is) throws java.io.IOException, java.text.ParseException {
    java.io.BufferedReader rdr = new java.io.BufferedReader(new java.io.InputStreamReader(is));
    logger.debug("Starting to consume activity stream {} ...", streamName);
    while (!(java.lang.Thread.interrupted())) {
        final java.lang.String activity = rdr.readLine();
        if ((activity.length()) > 0) {
            handle(activity);
        }
    } 
}