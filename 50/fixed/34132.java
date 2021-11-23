@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.loopeer.bottomimagepicker.PickerFragment.newInstance(mImageFolders.get(position).images, position);
}