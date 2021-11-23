public void print(java.lang.String text, Log.LOGLEVEL priority) {
    Log.statusWindow.setTitle(text);
    if ((priority.value) <= (Log.loglevel.value)) {
        java.lang.String temp = ((((formatter.format(new java.util.Date())) + "\t") + (priority.toString())) + "\t") + text;
        java.lang.System.out.println(temp);
        Log.write(temp);
    }
}