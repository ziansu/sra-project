private void initFileLoader() {
    if ((mFileName) != null) {
        java.io.File currentFile = new java.io.File(mFileName);
        mFileArray = currentFile.getParentFile().listFiles(new be.ac.ulb.lisa.idot.dicom.file.DICOMFileFilter());
        mDICOMFileLoader = new be.ac.ulb.lisa.idot.android.dicomviewer.DICOMFragment.DICOMFileLoader(mLoadingHandler, mFileArray[((mCurrentFileIndex)++)]);
        mDICOMFileLoader.start();
        mBusy = true;
    }
}