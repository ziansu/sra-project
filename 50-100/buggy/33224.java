@java.lang.Override
public void onSuccess(com.ben.yjh.babycare.model.Event classOfT) {
    android.util.Log.d("", "");
    classOfT.setImage1(mImageUrl);
    classOfT.save();
    android.content.Intent intent = getIntent();
    intent.putExtra(Constants.EVENT, classOfT);
    setResult(com.ben.yjh.babycare.main.event.RESULT_OK, intent);
    finish();
}