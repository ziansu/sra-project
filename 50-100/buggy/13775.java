@java.lang.Override
public void onClick(android.view.View v) {
    if (((v == (dateReceiveWrapper)) || (v == (dateFromWrapper))) || (v == (dateToWrapper))) {
        if (v == (dateReceiveWrapper))
            app.ddf.danskdatahistoriskforening.RegisterDetailsFragment.currentDateField = dateReceive;
        else
            if (v == (dateFromWrapper))
                app.ddf.danskdatahistoriskforening.RegisterDetailsFragment.currentDateField = dateFrom;
            else
                app.ddf.danskdatahistoriskforening.RegisterDetailsFragment.currentDateField = dateTo;
            
        
        android.support.v4.app.DialogFragment datePicker = new app.ddf.danskdatahistoriskforening.DatePickerFragment();
        datePicker.show(getActivity().getSupportFragmentManager(), "datePicker");
    }
}