@java.lang.Override
public void onClick(android.view.View v) {
    if (v.equals(recordAllTV)) {
        if (((onRecordAllClickListener) != null) && ((vaccineCardAdapter) != null)) {
            onRecordAllClickListener.onClick(vaccineCardAdapter.getDueVaccines());
        }
    }else
        if (v instanceof org.ei.opensrp.path.view.VaccineCard) {
            if ((onVaccineClickedListener) != null) {
                onVaccineClickedListener.onClick(((org.ei.opensrp.path.view.VaccineCard) (v)).getVaccineWrapper());
            }
        }
    
}