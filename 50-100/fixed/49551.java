public static int getUserLevelCount(java.lang.String sender) {
    int count = 0;
    for (int i = 0; i < (mclama.com.SMMHandler.levels.size()); i++) {
        mclama.com.LevelCode cur_lvl = mclama.com.SMMHandler.levels.get(i);
        if (cur_lvl.getAuthor().equals(sender)) {
            count++;
        }
    }
    return count;
}