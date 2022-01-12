@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, uk.ac.cam.cl.foxtrot.FilterResults results) {
    if ((results.count) == 0) {
        uk.ac.cam.cl.foxtrot.PatientAdapter.data = ((java.util.List<uk.ac.cam.cl.foxtrot.models.Patient>) (results.values));
        notifyDataSetInvalidated();
    }else {
        uk.ac.cam.cl.foxtrot.PatientAdapter.data = ((java.util.List<uk.ac.cam.cl.foxtrot.models.Patient>) (results.values));
        notifyDataSetChanged();
    }
}