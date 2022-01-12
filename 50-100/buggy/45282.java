@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    com.cse280.adriansandoval.converit.Currency currency = new com.cse280.adriansandoval.converit.Currency();
    currency.eurToUsd = java.lang.Double.parseDouble(eurToUSD);
    currency.gbpToUsd = java.lang.Double.parseDouble(gbpToUSD);
    currency.eurToGbp = java.lang.Double.parseDouble(eurToGBP);
    currency.eurToJpy = java.lang.Double.parseDouble(eurToJPY);
    currency.usdToJpy = java.lang.Double.parseDouble(usdToJPY);
    currency.gbpToJpy = java.lang.Double.parseDouble(gbpToJPY);
}