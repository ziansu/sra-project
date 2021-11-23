public void setCurrency(java.lang.String currency) {
    this.currency = currency;
    if ((currentFragment) != null)
        currentFragment.setCurrency(currency);
    
}