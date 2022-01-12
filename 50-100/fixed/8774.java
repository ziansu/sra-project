@java.lang.Override
public void onTaskComplete(java.util.ArrayList<group3.tcss450.uw.edu.thememebible.Model.Meme> theMemeData) {
    dismissProgressBar();
    mMemeData = theMemeData;
    if (!(mMemeData.isEmpty())) {
        android.os.Bundle args = new android.os.Bundle();
        args.putSerializable(getString(R.string.photo_data_key), mMemeData);
        mPhotoFragment.setArguments(args);
        loadFragment(mPhotoFragment);
    }
}