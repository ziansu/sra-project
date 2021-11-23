public java.util.List<org.eyeseetea.malariacare.presentation.factory.monitor.MonitorRowBuilder> defineRows() {
    java.util.List<org.eyeseetea.malariacare.presentation.factory.monitor.MonitorRowBuilder> rowBuilders = new java.util.ArrayList<>();
    rowBuilders.add(new org.eyeseetea.malariacare.presentation.factory.monitor.rows.PeriodRowBuilder(mContext, R.string.consumption));
    return rowBuilders;
}