@java.lang.Override
protected void onClose() {
    mezz.jei.JustEnoughItems.getProxy().restartJEI();
}