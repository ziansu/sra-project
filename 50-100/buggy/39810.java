@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int item) {
    switch (item) {
        case 0 :
            dialog.dismiss();
            android.os.Bundle arguments = new android.os.Bundle();
            arguments.putParcelable("direction", direction);
            formFragment = new com.example.vsokoltsov.uprogress.directions_list.popup.DirectionsListPopup();
            formFragment.setArguments(arguments);
            formFragment.setPopupInterface(this);
            formFragment.show(getFragmentManager(), "dialog");
            break;
        case 1 :
            break;
        default :
            break;
    }
}