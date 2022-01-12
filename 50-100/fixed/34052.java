@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mCurrentRadioStation = mStationList.get(position);
    mIsPlaying = true;
    android.content.Intent intent = new android.content.Intent(this, com.yeahdev.yeahstreamer.service.StreamService.class);
    intent.putExtra(Constants.EXTRA_STATION_NAME, mCurrentRadioStation.getName());
    intent.putExtra(Constants.EXTRA_STATION_URI, mCurrentRadioStation.getUrl());
    intent.setAction(Constants.ACTION_PLAY);
    startService(intent);
}