@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.yeahdev.yeahstreamer.models.RadioStation radioStation = mStationList.get(position);
    mCurrentRadioStation = radioStation;
    mIsPlaying = true;
    android.content.Intent intent = new android.content.Intent(this, com.yeahdev.yeahstreamer.service.StreamService.class);
    intent.putExtra(Constants.EXTRA_STATION_NAME, radioStation.getName());
    intent.putExtra(Constants.EXTRA_STATION_URI, radioStation.getUrl());
    intent.setAction(Constants.ACTION_PLAY);
    startService(intent);
}