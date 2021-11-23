static void addShow(java.lang.String showName, com.google.code.tvrenamer.model.Show show) {
    com.google.code.tvrenamer.model.ShowStore.logger.info((("Show listing for '" + (show.getName())) + "' downloaded"));
    com.google.code.tvrenamer.model.ShowStore._shows.put(showName.toLowerCase(), show);
    com.google.code.tvrenamer.model.ShowStore.notifyListeners(showName, show);
}