public java.lang.String getChoices(int choice) {
    com.matthewddiaz.namethatcountry.ShuffleString s1 = new com.matthewddiaz.namethatcountry.ShuffleString(mChoices);
    mChoices = s1.shuffle();
    return mChoices[choice];
}