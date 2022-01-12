public java.lang.String getImageSizeInMB() {
    java.text.DecimalFormat nf = ((java.text.DecimalFormat) (java.text.DecimalFormat.getInstance()));
    nf.setMaximumFractionDigits(1);
    nf.setMinimumFractionDigits(1);
    return nf.format((((getExactSize()) - (getAnnotationsSize())) / 1048576.0));
}