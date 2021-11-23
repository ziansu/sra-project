public void buttoncatchonclick() {
    btncatch = ((android.widget.Button) (findViewById(R.id.btncatch)));
    btncatch.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            buattoast("button catch em all");
        }
    });
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.example.audi.projectutspenir.catchall.class);
    startActivity(i);
}