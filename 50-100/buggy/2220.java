public void nextLevel() {
    _maxScoreReached = false;
    _starUnlocked = false;
    if ((_timesCompleted) < (app.model.LevelModel.MAX_SCORE)) {
        (_timesCompleted)++;
        _starUnlocked = true;
        int index = app.model.LevelModel._levels.indexOf(this);
        app.model.LevelModel._levels.remove(index);
        app.model.LevelModel._levels.add(index, this);
        if ((_timesCompleted) == (app.model.LevelModel.MAX_SCORE)) {
            _maxScoreReached = true;
        }
    }else {
    }
    app.model.LevelModel.syncLevels();
}