public void start() {
    if ((this._runnable) != null) {
        _handler.postDelayed(_runnable, _time);
    }
}