@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<ua.nure.vkmessanger.http.model.CustomResponse> loader, ua.nure.vkmessanger.http.model.CustomResponse data) {
    if ((data.getRequestResult()) == (ua.nure.vkmessanger.http.model.RequestResult.SUCCESS)) {
        switch (loader.getId()) {
            case ua.nure.vkmessanger.activity.WallPostActivity.LOAD_GROUPS :
                this.mGroups = data.getTypedAnswer();
                updateWallOwnersUIInfo(mGroups);
                for (ua.nure.vkmessanger.model.Group group : mGroups) {
                    android.util.Log.d("GROUP DATA LOADED", group.toString());
                }
                break;
        }
    }
}