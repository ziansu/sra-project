public void onClickFinish(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, mamn10grupp10.pulserunner.RunActivityTreadmillFinish.class);
    myAvgSpeed = round(((myAvgSpeed) / (stopwatch.getTimeElapsedAsLong())));
    distance = totDist;
    intent.putExtra("speed", speed);
    intent.putExtra("mySpeedSmooth", mySpeedSmooth);
    intent.putExtra("time", displayTime.getText().toString());
    intent.putExtra("distance", distance);
    startActivity(intent);
}