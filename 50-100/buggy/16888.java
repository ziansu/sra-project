@java.lang.Override
public void done(com.parse.ParseObject object, com.parse.ParseException e) {
    if (object != null) {
        com.parse.ParseFile parseFile = object.getParseFile("thumbnail");
        parseFile.getFileInBackground(new com.parse.GetFileCallback() {
            @java.lang.Override
            public void done(java.io.File file, com.parse.ParseException e) {
                u.setProfilo(file);
                adapter.notifyDataSetChanged();
            }
        });
    }else {
        users.add(u);
        adapter.notifyDataSetChanged();
    }
}