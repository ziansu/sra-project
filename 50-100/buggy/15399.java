@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonSend :
            con.put(model.COLUMN_FILM_ID, film.getFilmID());
            con.put(model.COLUMN_TEXT, commentText.getText().toString());
            model.insert(con);
            commentText.setText("");
            loadComment();
    }
}