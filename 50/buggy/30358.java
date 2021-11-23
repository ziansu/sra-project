public static void removeViewModel() {
    if (com.daquexian.chaoli.forum.meta.NightModeHelper.shouldClear) {
        com.daquexian.chaoli.forum.meta.NightModeHelper.mViewModel = null;
    }else {
        com.daquexian.chaoli.forum.meta.NightModeHelper.shouldClear = true;
    }
}