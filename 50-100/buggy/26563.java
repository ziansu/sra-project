@java.lang.Override
public void onDialogEdit(ch.hgdev.toposuite.calculation.activities.axisimpl.MeasureDialogFragment dialog) {
    int position = this.axisImpl.getMeasures().indexOf(dialog.getMeasure());
    ch.hgdev.toposuite.calculation.Measure m = this.axisImpl.getMeasures().get(position);
    m.setMeasureNumber(dialog.getMeasureNumber());
    m.setHorizDir(dialog.getHorizDir());
    m.setDistance(dialog.getDistance());
    this.adapter.notifyDataSetChanged();
    ch.hgdev.toposuite.utils.ViewUtils.unlockScreenOrientation(this);
}