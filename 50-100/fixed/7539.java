private static int upSituation() {
    if ((com.hedspi.hoangviet.eslrecom.helpers.TestHelper.currentTestDifficulty.equals(Preference.ADVANCE)) || ((com.hedspi.hoangviet.eslrecom.helpers.TestHelper.upperAchivedDifficulty) != null)) {
        com.hedspi.hoangviet.eslrecom.helpers.TestHelper.currentUserProficiency = com.hedspi.hoangviet.eslrecom.helpers.TestHelper.currentTestDifficulty;
        return com.hedspi.hoangviet.eslrecom.helpers.TestHelper.STATUS_END;
    }else {
        com.hedspi.hoangviet.eslrecom.helpers.TestHelper.lowerAchivedDifficulty = com.hedspi.hoangviet.eslrecom.helpers.TestHelper.currentTestDifficulty;
        com.hedspi.hoangviet.eslrecom.helpers.TestHelper.upgradeLevel();
        com.hedspi.hoangviet.eslrecom.helpers.TestHelper.resetProperties();
        return com.hedspi.hoangviet.eslrecom.helpers.TestHelper.STATUS_CONTINUE;
    }
}