public void onTouchDrawer(int position) {
    switch (position) {
        case compsci290.edu.duke.myeveryday.util.Constants.NOTES :
            startActivity(new android.content.Intent(this, compsci290.edu.duke.myeveryday.MainActivity.class));
            break;
        case compsci290.edu.duke.myeveryday.util.Constants.CATEGORIES :
            startActivity(new android.content.Intent(this, compsci290.edu.duke.myeveryday.Tag.TagList.class));
            break;
        case compsci290.edu.duke.myeveryday.util.Constants.ANALYTICS :
            break;
        case compsci290.edu.duke.myeveryday.util.Constants.LOGOUT :
            logout();
            break;
        case compsci290.edu.duke.myeveryday.util.Constants.ATLAS :
            startActivity(new android.content.Intent(this, compsci290.edu.duke.myeveryday.AtlasActivity.class));
            break;
        case compsci290.edu.duke.myeveryday.util.Constants.DELETE :
            deleteAccountClicked();
            break;
    }
}