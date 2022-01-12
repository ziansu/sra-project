public static void changeMode(com.daquexian.chaoli.forum.viewmodel.BaseViewModel viewModel) {
    if (com.daquexian.chaoli.forum.meta.NightModeHelper.isDay()) {
        com.daquexian.chaoli.forum.meta.NightModeHelper.setNight();
    }else {
        com.daquexian.chaoli.forum.meta.NightModeHelper.setDay();
    }
    com.daquexian.chaoli.forum.meta.NightModeHelper.mViewModel = viewModel;
    com.daquexian.chaoli.forum.meta.NightModeHelper.shouldClear = true;
}