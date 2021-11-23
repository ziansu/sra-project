@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.imgReportInfo :
            long id = ((long) (v.getTag(R.string._id)));
            de.aw.reports.DialogReportDaten d = de.aw.reports.DialogReportDaten.newInstance(id);
            d.show(getFragmentManager(), d.getTAG());
            break;
        default :
            super.onClick(v);
    }
}