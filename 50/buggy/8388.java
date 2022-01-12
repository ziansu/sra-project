public java.lang.String getTimeDisplay(shared.CustomTime time) {
    java.lang.String display = EMPTY_STRING;
    if (time.hasTime()) {
        display = this._timeFormat.format(time.getTime());
    }
    return display;
}