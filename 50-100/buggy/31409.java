@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            showAll(view);
            break;
        case 1 :
            showGlasses(view);
            break;
        case 2 :
            showShirts(view);
            break;
        case 3 :
            showHats(view);
            break;
        case 4 :
            showSpecial(view);
            break;
        default :
            showAll(view);
            break;
    }
    checkAchievements();
}