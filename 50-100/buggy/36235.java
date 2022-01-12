private void calculate_gpa(android.view.View v) {
    double sum = 0;
    for (android.widget.SeekBar s : seekBars) {
        sum += s.getProgress();
    }
    java.text.DecimalFormat df = new java.text.DecimalFormat("#.000");
    android.widget.TextView output = ((android.widget.TextView) (findViewById(R.id.Output)));
    output.setText(("Your Gpa for this semester is: " + (df.format((sum / (seekBars.size()))))));
}