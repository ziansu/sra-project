@butterknife.OnClick(value = { R.id.sunday_box , R.id.monday_box , R.id.tuesday_box , R.id.wednesday_box , R.id.thursday_box , R.id.friday_box , R.id.saturday_box })
public void onDayBoxClicked(android.widget.TextView v) {
    v.setEnabled(false);
    int backgroundColor = ((android.graphics.drawable.ColorDrawable) (v.getBackground())).getColor();
    if (backgroundColor == (colorNotSelected)) {
        v.setBackgroundColor(colorSelected);
    }else {
        v.setBackgroundColor(colorNotSelected);
    }
    v.setEnabled(true);
}