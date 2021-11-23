@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.btnOk :
            sendToServer();
            break;
        case R.id.btnRemovePhoto :
            if (((oldContact) != null) && ((oldContact.getPhotoName().length()) > 0)) {
                isNeedRemovePhoto = true;
            }
            uriPhoto = null;
            ivPhoto.setImageResource(R.drawable.person_default);
            btnRemovePhoto.setVisibility(View.INVISIBLE);
            break;
    }
}