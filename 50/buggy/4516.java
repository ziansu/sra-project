public void onClick(android.content.DialogInterface dialog, int whichButton) {
    legacyAddress.setLabel(legacyAddress.getAddress());
    remoteSaveUnmatchedPrivateKey(legacyAddress);
}