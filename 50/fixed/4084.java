private void refreshAdapter() {
    if (!(ruleList.isEmpty())) {
        ruleList.clear();
    }
    ruleList.addAll(preferencesService.getUserRules());
    notifyDataSetChanged();
    notifyDataSetInvalidated();
}