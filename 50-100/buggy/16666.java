@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.out.println("Result generating");
    int result = table.play();
    java.lang.System.out.println(("Spin Result:" + result));
    int payout = table.payout();
    java.lang.System.out.println(("Payout:" + payout));
    final com.mouthofrandom.cardshark.activities.Intent intent = new com.mouthofrandom.cardshark.activities.Intent(this, com.mouthofrandom.cardshark.activities.RouletteWheelActivity.class);
    android.widget.Button spinButton = ((android.widget.Button) (findViewById(R.id.Spin)));
    intent.putExtra(com.mouthofrandom.cardshark.activities.RouletteBoardActivity.RESULT_MESSAGE, result);
    startActivity(intent);
    resetAllBetTiles();
}