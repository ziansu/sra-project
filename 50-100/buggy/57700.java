@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.horse.core.ServerConnection.sendMessage((((com.horse.core.MessageType.CMD) + " playgame: ") + (selectedGame.ShortName)));
    findViewById(R.id.gameListView).setVisibility(View.GONE);
    findViewById(R.id.selectAGameTextView).setVisibility(View.GONE);
    dialog.dismiss();
    findViewById(R.id.loading).setVisibility(View.VISIBLE);
    findViewById(R.id.loadingProgressbar).setVisibility(View.VISIBLE);
    waitForSelection();
}