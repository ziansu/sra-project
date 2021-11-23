@java.lang.Override
protected java.lang.Long doInBackground(java.lang.Void... params) {
    be.sourcery.ascent.eighta.EightA eightA = new be.sourcery.ascent.eighta.EightA(prefs.getString(be.sourcery.ascent.USER_ID, null), prefs.getString(be.sourcery.ascent.SESSION_ID, null));
    long added = eightA.importData(getBaseContext());
    update();
    return added;
}