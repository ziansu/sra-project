public boolean save(java.lang.String key, java.lang.String value) {
    if (java.util.Arrays.asList(this.gameInfo.stringFieldNames).contains(key)) {
        try {
            java.lang.reflect.Field field = edu.calvin.the_b_team.calvinassassingame.GameClass.GameInfo.class.getField(key);
            field.set(this.gameInfo, value);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
        saveToDrive();
        return true;
    }
    android.util.Log.i("bad value in save", key);
    return false;
}