private void setMask(java.lang.String mask) {
    com.vicmikhailau.maskededittext.MaskedFormatter formatter = new com.vicmikhailau.maskededittext.MaskedFormatter(mask);
    mEdtMasked.addTextChangedListener(new com.vicmikhailau.maskededittext.MaskedWatcher(formatter, mEdtMasked));
    java.lang.String s = formatter.formatString(mEdtMasked.getText().toString()).getUnMaskedString();
}