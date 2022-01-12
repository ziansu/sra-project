private void getReplyDoc(java.lang.String title, java.lang.String id) {
    java.lang.System.out.println(title);
    com.example.oscar.riksdagen.MainModule.ListItem reply = new com.example.oscar.riksdagen.MainModule.ListItem(context);
    listLayout.addView(reply);
    title = title.replace(" ", "+");
    reply.setTitle("Svar på skriftlig fråga:");
    new com.example.oscar.riksdagen.Tools.ReplyFinder(title, id, reply).execute();
}