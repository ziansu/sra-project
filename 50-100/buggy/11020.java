public android.support.v4.content.Loader<java.util.ArrayList<gov.wa.wsdot.android.wsdot.shared.AmtrakCascadesServiceItem>> onCreateLoader(int id, android.os.Bundle args) {
    if (gov.wa.wsdot.android.wsdot.ui.amtrakcascades.AmtrakCascadesSchedulesDetailsFragment.toLocation.equalsIgnoreCase("N/A")) {
        return new gov.wa.wsdot.android.wsdot.ui.amtrakcascades.AmtrakCascadesSchedulesDetailsFragment.DepartingTrainsLoader(getActivity());
    }else
        if (gov.wa.wsdot.android.wsdot.ui.amtrakcascades.AmtrakCascadesSchedulesDetailsFragment.fromLocation.equalsIgnoreCase(gov.wa.wsdot.android.wsdot.ui.amtrakcascades.AmtrakCascadesSchedulesDetailsFragment.toLocation)) {
            gov.wa.wsdot.android.wsdot.ui.amtrakcascades.AmtrakCascadesSchedulesDetailsFragment.toLocation = "N/A";
            return new gov.wa.wsdot.android.wsdot.ui.amtrakcascades.AmtrakCascadesSchedulesDetailsFragment.DepartingTrainsLoader(getActivity());
        }else {
            return new gov.wa.wsdot.android.wsdot.ui.amtrakcascades.AmtrakCascadesSchedulesDetailsFragment.DepartingArrivingTrainsLoader(getActivity());
        }
    
}