@java.lang.Override
public void done(java.util.List<com.parse.ParseObject> list, com.parse.ParseException e) {
    if (e == null) {
        for (int i = 0; i < (list.size()); i++) {
            searchableUsers.add(((java.lang.String) (list.get(i).get("username"))));
        }
    }
}