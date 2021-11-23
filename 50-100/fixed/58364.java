public static java.lang.String getMessage(int statusCode) {
    switch (statusCode) {
        case com.example.kouhot.bookmanager_android.api.ApiError.BAD_REQUEST :
            return com.example.kouhot.bookmanager_android.utils.MyApplication.getInstance().getString(R.string.bad_request);
        case com.example.kouhot.bookmanager_android.api.ApiError.UNAUTHORIZED :
            return com.example.kouhot.bookmanager_android.utils.MyApplication.getInstance().getString(R.string.unauthorized);
        case com.example.kouhot.bookmanager_android.api.ApiError.INTERNAL_SERVER_ERROR :
            return com.example.kouhot.bookmanager_android.utils.MyApplication.getInstance().getString(R.string.internal_server_error);
        default :
            return com.example.kouhot.bookmanager_android.utils.MyApplication.getInstance().getString(R.string.default_error_message);
    }
}