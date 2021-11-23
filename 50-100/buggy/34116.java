@java.lang.Override
public void onStart() {
    android.util.Log.i(ru.kuchanov.tproger.fragment.FragmentCategory.LOG, "onStart called");
    super.onStart();
    spiceManager.start(ctx);
    spiceManager.addListenerIfPending(ru.kuchanov.tproger.robospice.db.Articles.class, "unused", new ru.kuchanov.tproger.fragment.FragmentCategory.ListFollowersRequestListener());
    spiceManagerOffline.start(ctx);
    spiceManagerOffline.addListenerIfPending(ru.kuchanov.tproger.robospice.db.Articles.class, "unused", new ru.kuchanov.tproger.fragment.FragmentCategory.ListFollowersRequestListener());
    if ((artsList.size()) == 0) {
        performRequest(1, false);
    }
}