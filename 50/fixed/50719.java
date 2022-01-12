public java.lang.String getSkyperAddress() {
    if (!(searchAddress.getText().isEmpty())) {
        int intAddr = java.lang.Integer.parseInt(searchAddress.getText());
        return java.lang.Integer.toHexString(intAddr);
    }else {
        return null;
    }
}