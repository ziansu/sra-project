public void initClassFields() {
    mainActivity = ((lenremont.crm.ru.master.main.MainActivity) (getActivity()));
    sqLiteWork = new lenremont.crm.ru.master.sqlite_work.SQLiteWork(myFragmentView.getContext());
    masterPreferences = new lenremont.crm.ru.master.shared_preferences.MasterPreferences(getContext());
    internetWork = new lenremont.crm.ru.master.additional_functions.InternetWork(getContext());
    clientSocketService = mainActivity.clientSocketService;
}