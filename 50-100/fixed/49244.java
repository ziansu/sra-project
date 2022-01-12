private void markPosition(android.view.View view) {
    if (null == (location)) {
        android.widget.Toast.makeText(this, "GPS ist nicht bereit", Toast.LENGTH_SHORT).show();
        return ;
    }
    android.content.Intent intent = new android.content.Intent(this, de.master.kd.epic.view.position.PositionEditActivity.class);
    intent.putExtra(Constants.PARAMETER.LOCATION.name(), location);
    intent.putExtra(Constants.PARAMETER.POSITION_ID.name(), Constants.RESULT.NEW);
    startActivityForResult(intent, Constants.RESULT.NEW.ordinal());
}