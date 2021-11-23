@java.lang.Override
protected void onPostExecute(java.lang.Boolean aBoolean) {
    if (aBoolean) {
        mNowTextView.setText(java.lang.String.valueOf(mQueue.getNextNumber()));
        mTotalTextView.setText(java.lang.String.valueOf(mQueue.getTotal()));
    }else {
        android.widget.Toast.makeText(getActivity(), "获取队列信息失败，请重试", Toast.LENGTH_LONG).show();
    }
}