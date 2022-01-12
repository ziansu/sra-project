@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt(com.example.sunny.test.MainActivity.Key_INDEX, mCurrentIndex);
    outState.putBoolean(com.example.sunny.test.MainActivity.USER_IS_CHEATER, mIsCheater);
    outState.putBooleanArray(com.example.sunny.test.MainActivity.Cheat_INDEXS, mCheatIndexs);
    android.util.Log.d(com.example.sunny.test.MainActivity.TAG, java.lang.String.format("save mCurrentIndex %d", mCurrentIndex));
}