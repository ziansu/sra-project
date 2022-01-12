@java.lang.Override
public void buyPotion(items.Potion potion) {
    if ((main.Player.getMoney()) > (potion.getSellsFor())) {
        main.Player.setMoney(((main.Player.getMoney()) - (potion.getSellsFor())));
        main.Player.addPotion(potion);
        main.NewShop.boughtAPot(potion);
    }
    main.ConsoleRenderer.whereAreWe = main.ConsoleRenderer.inMenu;
    printMenu();
}