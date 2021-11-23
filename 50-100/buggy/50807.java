@java.lang.Override
public void done(java.util.List<com.org.saolonguinho.shared.models.Objects> list, com.parse.ParseException e) {
    if (e == null) {
        com.org.saolonguinho.list.ListObjectsAdapter listObjectsAdapter = new com.org.saolonguinho.list.ListObjectsAdapter(list);
        rv.setAdapter(listObjectsAdapter);
        rv.getAdapter().notifyDataSetChanged();
        progressDialog.dismiss();
    }else {
    }
}