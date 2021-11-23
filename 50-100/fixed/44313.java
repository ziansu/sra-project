@java.lang.Override
protected void onPostExecute(com.example.codingslash.leaguemonitorapp.SummonerInfo info) {
    progressdialog.hide();
    wakelock.release();
    android.content.Intent intent = new android.content.Intent(context, com.example.codingslash.leaguemonitorapp.SummonerInfoActivity.class);
    if ((info.getSummId()) == (-1L)) {
        android.widget.Toast.makeText(context, "Summoner ID NOT FOUND", Toast.LENGTH_LONG).show();
    }else {
        android.widget.Toast.makeText(context, "Summoner ID FOUND", Toast.LENGTH_LONG).show();
        intent.putExtra("SUMMONER_INFO", info);
        startActivity(intent);
    }
}