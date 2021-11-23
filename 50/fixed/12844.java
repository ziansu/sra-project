@java.lang.Override
public void onResponse(com.wilee8.coyotereader2.gson.UserInfo response) {
    com.wilee8.coyotereader2.mUserId = response.getUserId();
    subscriber.onNext(null);
}