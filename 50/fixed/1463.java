@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    if (error.getKind().toString().equals(com.ross.feehan.londontubelinestatus.Data.Implementations.GetTubeLineStatusImpl.NETWORKERROR)) {
        listenerClass.noInternetConnection();
    }else {
        listenerClass.somethingWentWrong("Sorry, something went wrong while fetching the tube line states");
    }
}