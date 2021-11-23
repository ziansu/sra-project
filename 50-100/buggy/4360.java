public void completeWorkoutClick(android.view.View v) {
    if ((_day) == 3) {
        int week = _settings.getWeek();
        _settings.setDay(1);
        _settings.setWeek(((_week) + 1));
    }else {
        _settings.setDay(((_day) + 1));
    }
    this.finish();
}