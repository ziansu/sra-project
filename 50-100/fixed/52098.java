void setProgress(java.lang.String redeemed, java.lang.String sold) {
    try {
        int percentage = ((int) (((java.lang.Float.parseFloat(redeemed)) / (java.lang.Float.parseFloat(sold))) * 100));
        progressBar.setProgress(percentage);
        tvRedeemedNumber.setText(redeemed);
        tvSoldNumber.setText(sold);
        tvProgressText.setText(java.lang.Integer.toString(percentage));
    } catch (java.lang.Exception e) {
    }
}