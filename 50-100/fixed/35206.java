public void done(com.parse.ParseObject object, com.parse.ParseException e) {
    if (object == null) {
        java.lang.System.out.println("The getFirst request failed.");
    }else {
        best = object.get("option_name").toString();
        txtBest = ((android.widget.TextView) (findViewById(R.id.best)));
        txtBest.setText(best);
    }
}