public void displayLendDetails(org.bbt.kiakoa.model.Lend lend) {
    if ((lendDetailsFragment) != null) {
        lendDetailsFragment.setLend(lend);
    }else {
        if (lend != null) {
            android.content.Intent intent = new android.content.Intent(this, org.bbt.kiakoa.LendDetailsActivity.class);
            intent.putExtra(LendDetailsActivity.EXTRA_LEND, lend);
            startActivity(intent);
        }
    }
}