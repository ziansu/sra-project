public void setTotalAmount() {
    total = 0.0F;
    for (wallyson.com.br.mypocket.model.Spending sp : spending) {
        total += sp.getAmount();
    }
    java.text.DecimalFormat df = new java.text.DecimalFormat();
    df.setMaximumFractionDigits(2);
    edtTotal.setText(java.lang.String.valueOf(df.format(total)));
}