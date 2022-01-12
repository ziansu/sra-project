private void addLoadingSpinner(java.lang.String title, java.lang.String message) {
    if (!(jsonFetcher.isTesting())) {
        loadingSpinner = new android.app.ProgressDialog(uk.ac.ncl.csc2022.t14.bankingapp.Utilities.BankingApp.getContext());
        loadingSpinner.setTitle(title);
        loadingSpinner.setMessage(message);
        if (!(loadingSpinner.isShowing()))
            loadingSpinner.show();
        
    }
}