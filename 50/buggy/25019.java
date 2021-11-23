@java.lang.Override
public void onResult(java.util.List<com.company.translater.business.TranslateHistory> translateHistoryDbList) {
    list.clear();
    list.addAll(translateHistoryDbList);
    logger.logError(list.toString());
    adapter.notifyDataSetChanged();
    hideProgress();
}