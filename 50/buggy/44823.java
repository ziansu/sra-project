public static int getTextColor(android.content.Context context) {
    switch (fr.ybo.transportsrennes.application.TransportsRennesApplication.getTheme(context)) {
        case 1 :
            return android.graphics.Color.LTGRAY;
        default :
            return android.graphics.Color.BLACK;
    }
}