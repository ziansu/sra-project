private void displayUnlockedDoc(edu.caltech.cs141b.hw5.android.data.UnlockedDocument doc) {
    android.util.Log.i(edu.caltech.cs141b.hw5.android.UnlockedDocView.TAG, "displaying the unlocked doc");
    if (doc != null) {
        titleBox.setText(doc.getTitle());
        contentBox.setText(doc.getContents());
    }else
        android.util.Log.i(edu.caltech.cs141b.hw5.android.UnlockedDocView.TAG, "doc = null");
    
}