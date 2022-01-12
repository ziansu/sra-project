private void intelliPlugInit() {
    if (com.grarak.kerneladiutor.utils.kernel.CPUHotplug.hasIntelliPlugEnable()) {
        mIntelliPlugCard = new com.grarak.kerneladiutor.elements.cards.SwitchCardView.DSwitchCard();
        mIntelliPlugCard.setTitle(getString(R.string.intelliplug));
        mIntelliPlugCard.setDescription(getString(R.string.intelliplug_summary));
        mIntelliPlugCard.setChecked(com.grarak.kerneladiutor.utils.kernel.CPUHotplug.isIntelliPlugActive());
        mIntelliPlugCard.setOnDSwitchCardListener(this);
        addView(mIntelliPlugCard);
    }
}