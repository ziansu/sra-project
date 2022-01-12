private void initPrice() {
    org.powerbot.script.GeItem ge = new org.powerbot.script.GeItem(sap);
    psapphire = ge.price;
    ge = new org.powerbot.script.GeItem(eme);
    pemerald = ge.price;
    ge = new org.powerbot.script.GeItem(rub);
    pruby = ge.price;
    ge = new org.powerbot.script.GeItem(dia);
    pdiamond = ge.price;
}