public void onRadioButtonClicked(android.view.View view) {
    boolean checked = ((android.widget.RadioButton) (view)).isChecked();
    switch (view.getId()) {
        case R.id.easyCheck :
            if (!checked)
                l00lgamescommunity.movingsquares.MovingSquareStartActivity.level = 1;
            
            break;
        case R.id.mediumCheck :
            if (!checked)
                l00lgamescommunity.movingsquares.MovingSquareStartActivity.level = 2;
            
            break;
        case R.id.expertCheck :
            if (!checked)
                l00lgamescommunity.movingsquares.MovingSquareStartActivity.level = 3;
            
            break;
    }
}