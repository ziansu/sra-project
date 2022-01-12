@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            startActivity(new android.content.Intent(this, com.chanonly123.airhockey2d.MainActivity.class));
            break;
        case 1 :
            sharePlayStoreLink();
            break;
        case 2 :
            break;
        case 3 :
            goToGithub();
            break;
        default :
            break;
    }
}