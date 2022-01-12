private void getReplyDoc(java.lang.String title) {
    com.example.oscar.riksdagen.MainModule.ListItem reply = new com.example.oscar.riksdagen.MainModule.ListItem(context);
    listLayout.addView(reply);
    title = title.replace(" ", "+");
    reply.setTitle("Svar på skriftlig fråga:");
    new com.example.oscar.riksdagen.Tools.ReplyFinder(title, reply).execute();
}