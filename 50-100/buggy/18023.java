public void onClick(android.content.DialogInterface dialog, int which) {
    ad.executeQuery(((((("UPDATE assignment SET name = '" + (editText.getText().toString())) + "'") + "WHERE name = '") + (holder.name.getText().toString())) + "'"));
    com.collegeessentials.main.Assignment.super.recreate();
}