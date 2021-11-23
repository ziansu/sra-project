public static nordpol.android.AndroidCard get(android.nfc.Tag tag) throws java.io.IOException {
    android.nfc.tech.IsoDep card = android.nfc.tech.IsoDep.get(tag);
    if (card != null) {
        card.connect();
        card.close();
        return new nordpol.android.AndroidCard(card);
    }else {
        return null;
    }
}