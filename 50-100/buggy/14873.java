@java.lang.Override
protected void layoutWidgets() {
    setLayout(new java.awt.GridBagLayout());
    setNameWidget(0, 0, 1);
    setDescriptionWidget(0, 1, 1);
    setLengthTypeWidget(0, 2, 1);
    setMouthpieceWidget(1, 0, 3);
    setTerminationWidget(1, 3, 1);
    setHoleTableWidget(0, 3, java.awt.GridBagConstraints.REMAINDER);
    setBoreTableWidget(1, 4, 1);
}