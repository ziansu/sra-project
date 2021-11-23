@java.lang.Override
public void datePicked(java.lang.String date) {
    java.util.Date datePicked = com.extenprise.mapp.medico.util.Utility.getStrAsDate(date, "dd/MM/yyyy");
    if (!(com.extenprise.mapp.medico.util.Utility.isDateAfterToday(datePicked))) {
        com.extenprise.mapp.medico.customer.data.Customer customer = com.extenprise.mapp.medico.data.WorkingDataStore.getBundle().getParcelable("customer");
        if (customer != null) {
            mPname.setText(java.lang.String.format("%s %s\n(%d years)", customer.getfName(), customer.getlName(), com.extenprise.mapp.medico.util.Utility.getAge(customer.getDob())));
        }
    }
}