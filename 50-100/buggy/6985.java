@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        io.emqtt.emqandroidtoolkit.model.Connection connection = data.getParcelableExtra(ConnectionActivity.EXTRA_CONNECTION);
        if (null != connection) {
            switch (requestCode) {
                case io.emqtt.emqandroidtoolkit.ui.activity.MainActivity.REQUEST_ADD :
                    mConnectionAdapter.notifyItemInserted(((mConnectionResults.size()) - 1));
                    break;
                case io.emqtt.emqandroidtoolkit.ui.activity.MainActivity.REQUEST_EDIT :
                    mConnectionAdapter.notifyItemChanged(mPosition);
                    break;
            }
        }
    }
}