private static int downSituation() {
    if ((com.hedspi.hoangviet.eslrecom.helpers.TestHelper.currentTestDifficulty.equals(Preference.BEGINNER)) || ((com.hedspi.hoangviet.eslrecom.helpers.TestHelper.lowerAchivedDifficulty) != null)) {
        com.hedspi.hoangviet.eslrecom.helpers.TestHelper.currentUserProficiency = com.hedspi.hoangviet.eslrecom.helpers.TestHelper.currentTestDifficulty;
        return com.hedspi.hoangviet.eslrecom.helpers.TestHelper.STATUS_END;
    }else {
        com.hedspi.hoangviet.eslrecom.helpers.TestHelper.upperAchivedDifficulty = com.hedspi.hoangviet.eslrecom.helpers.TestHelper.currentTestDifficulty;
        com.hedspi.hoangviet.eslrecom.helpers.TestHelper.degradeLevel();
        com.hedspi.hoangviet.eslrecom.helpers.TestHelper.resetProperties();
        return com.hedspi.hoangviet.eslrecom.helpers.TestHelper.STATUS_CONTINUE;
    }
}