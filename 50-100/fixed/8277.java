public void onFalse(android.view.View view) {
    if (!(IS_PRIME)) {
        android.widget.Toast.makeText(this, "Your answer is correct!", Toast.LENGTH_SHORT).show();
        numberDisplay.setTextColor(android.graphics.Color.parseColor("#FF99CC00"));
    }else {
        android.widget.Toast.makeText(this, "Your answer is incorrect!", Toast.LENGTH_SHORT).show();
        numberDisplay.setTextColor(android.graphics.Color.parseColor("#FFD50000"));
    }
}