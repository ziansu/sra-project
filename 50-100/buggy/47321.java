private void puzzleSolved() {
    android.widget.Toast.makeText(getBaseContext(), "Puzzle Sovled!", Toast.LENGTH_LONG).show();
    timer.cancel(true);
    solveTime = timer.elapsedTime;
    timer = null;
    timeView.setText((((getString(R.string.time)) + ": ") + (intToHHMMSS(solveTime))));
}