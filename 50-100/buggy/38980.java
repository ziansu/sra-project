public void onTouchDrawer(int position) {
    switch (position) {
        case compsci290.edu.duke.myeveryday.util.Constants.NOTES :
            startActivity(new android.content.Intent(this, compsci290.edu.duke.myeveryday.MainActivity.class));
            break;
        case compsci290.edu.duke.myeveryday.util.Constants.CATEGORIES :
            break;
        case compsci290.edu.duke.myeveryday.util.Constants.ANALYTICS :
            startActivity(new android.content.Intent(this, compsci290.edu.duke.myeveryday.AnalyticsActivity.class));
            break;
        case compsci290.edu.duke.myeveryday.util.Constants.LOGOUT :
            logout();
            break;
        case compsci290.edu.duke.myeveryday.util.Constants.ATLAS :
            startActivity(new android.content.Intent(this, compsci290.edu.duke.myeveryday.AtlasActivity.class));
        case compsci290.edu.duke.myeveryday.util.Constants.DELETE :
            deleteAccountClicked();
            break;
    }
}