public void loadFragments() {
    if (isFullMode) {
        journalFragment = com.akvone.dlcifmo.JournalModule.JournalFragment.getInstance();
        changesProtocolFragment = com.akvone.dlcifmo.MainModule.BlankFragment.newInstance("Здесь будет протокол изменений");
        enrollFragment = com.akvone.dlcifmo.EnrollModule.EnrollMainFragment.getInstance();
    }else {
        journalFragment = com.akvone.dlcifmo.MainModule.NonAuthorizedFragment.newInstance();
        changesProtocolFragment = com.akvone.dlcifmo.MainModule.NonAuthorizedFragment.newInstance();
        enrollFragment = com.akvone.dlcifmo.MainModule.NonAuthorizedFragment.newInstance();
    }
    topStFragment = new com.akvone.dlcifmo.TopStudentsModule.TopStFragment();
    feedbackFragment = com.akvone.dlcifmo.MainModule.BlankFragment.newInstance("Здесь будет обратная связь");
}