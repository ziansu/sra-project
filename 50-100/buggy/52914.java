@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent i = new android.content.Intent(this, com.xp.note.EditNote.class);
    switch (view.getId()) {
        case R.id.text :
            startActivity(i);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
    }
}