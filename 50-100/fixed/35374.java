public void onClick11(android.view.View v) {
    android.widget.TextView tag = ((android.widget.TextView) (findViewById(R.id.tagudt)));
    if (tags.equalsIgnoreCase("")) {
        tags += "vegi";
        tag.setText(tags);
    }else {
        if (!(deleteDucplicate("vegi"))) {
            tags += ",vegi";
        }
        tag.setText(tags);
    }
}