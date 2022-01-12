@java.lang.Override
public void onLoadFinished(java.lang.String result) {
    ru.dubki.logger.Logger.log(this);
    lblRaceInfo.setText(result);
}