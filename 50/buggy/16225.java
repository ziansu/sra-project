public com.ihasama.ohtu.domain.Reference showDialog() {
    addContents();
    pack();
    setLocationByPlatform(true);
    setVisible(true);
    return generateReference();
}