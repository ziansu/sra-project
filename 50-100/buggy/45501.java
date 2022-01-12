public boolean purchase(java.lang.String message, int purchase) {
    if (((cash) - purchase) < 0) {
        edu.carleton.COMP2601.finalproject.GameActivity.getInstance().logs.append(("\n" + (R.string.client_notEnoughCash_log)));
        return false;
    }
    cash -= purchase;
    edu.carleton.COMP2601.finalproject.GameActivity.getInstance().logs.append((((("\n" + message) + " (-$") + purchase) + ")"));
    return true;
}