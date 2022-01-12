private void puzzleSolved() {
    if ((timer) != null) {
        timer.cancel(true);
        android.widget.Toast.makeText(getBaseContext(), "Puzzle Sovled!", Toast.LENGTH_LONG).show();
        solveTime = timer.elapsedTime;
        timer = null;
        timeView.setText((((getString(R.string.time)) + ": ") + (intToHHMMSS(solveTime))));
    }
}