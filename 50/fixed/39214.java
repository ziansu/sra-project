public static ru.spbau.mit.foodmanager.MenuStorage getInstance() {
    if ((ru.spbau.mit.foodmanager.MenuStorage.instance) == null) {
        ru.spbau.mit.foodmanager.MenuStorage.instance = new ru.spbau.mit.foodmanager.MenuStorage(ru.spbau.mit.foodmanager.CookBookStorage.getInstance());
    }
    return ru.spbau.mit.foodmanager.MenuStorage.instance;
}