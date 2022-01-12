@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menuChoosePicture :
            ChoosePicture(this);
            return true;
        case R.id.menuTakePicture :
            TakePicture();
            return true;
        case R.id.menuAddAircraft :
            fromView();
            if (com.myflightbook.android.ActNewAircraft.m_ac.FIsValid()) {
                com.myflightbook.android.ActNewAircraft.SaveAircraftTask st = new com.myflightbook.android.ActNewAircraft.SaveAircraftTask(getActivity());
                st.execute(com.myflightbook.android.ActNewAircraft.m_ac);
            }else
                Model.MFBUtil.Alert(this, getString(R.string.txtError), com.myflightbook.android.ActNewAircraft.m_ac.ErrorString);
            
        default :
            return super.onOptionsItemSelected(item);
    }
}