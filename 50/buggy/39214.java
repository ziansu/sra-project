public static ru.spbau.mit.foodmanager.MenuStorage getInstance(android.content.Context context) {
    if ((ru.spbau.mit.foodmanager.MenuStorage.instance) == null) {
        ru.spbau.mit.foodmanager.MenuStorage.instance = new ru.spbau.mit.foodmanager.MenuStorage(ru.spbau.mit.foodmanager.CookBookStorage.getInstance(context));
    }
    return ru.spbau.mit.foodmanager.MenuStorage.instance;
}