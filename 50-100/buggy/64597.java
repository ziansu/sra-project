public boolean save(java.lang.String key, java.lang.String value) {
    if (java.util.Arrays.asList(this.gameInfo.stringFieldNames).contains(key)) {
        try {
            android.util.Log.i("made it ", "here");
            java.lang.reflect.Field field = edu.calvin.the_b_team.calvinassassingame.GameClass.GameInfo.class.getField(key);
            field.set(this.gameInfo, value);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
        saveToDrive();
        android.util.Log.i("bad value in save", " ");
        return true;
    }
    return false;
}