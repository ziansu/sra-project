private void disableHistorieButton() {
    android.widget.Button historieButton = ((android.widget.Button) (findViewById(R.id.historie)));
    historieButton.setEnabled(false);
    historieButton.setBackgroundResource(R.color.colorLightGrey);
    historieButton.setTextColor(android.graphics.Color.parseColor("#403f3f"));
    historieButton.getBackground().setAlpha(45);
}