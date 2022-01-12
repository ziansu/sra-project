@java.lang.Override
public void onAddPage(org.emoncms.myapps.myelectric.MyElectricSettings settings) {
    int pos = getPosition(settings.getId());
    if (pos == (-1)) {
        android.util.Log.d("emon-menu", "Adding page to menu");
        menuOptionList.add(((menuOptionList.size()) - 2), new org.emoncms.myapps.MenuPageAdaptor.MenuOption(("" + ((menuOptionList.size()) - 2)), R.drawable.ic_my_electric_white_36dp, settings.getName()));
        notifyDataSetChanged();
    }
}