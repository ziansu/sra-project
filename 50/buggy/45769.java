private void load() {
    com.mygdx.utils.Save.classicHighScore = classic;
    com.mygdx.utils.Save.darkHighScore = dark;
    com.mygdx.utils.Save.money = 9999999;
    com.mygdx.utils.Save.ads = ads;
    com.mygdx.ui.menu.MoneyDisplay.setMoneyText(("" + (money)));
}