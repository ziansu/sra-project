public void done(com.parse.ParseException e) {
    if (e != null) {
        android.content.Intent mapIntent = new android.content.Intent();
        mapIntent.setClass(getApplicationContext(), com.example.cmput401.classdiscuss.MapActivity.class);
        startActivity(mapIntent);
    }else {
    }
}