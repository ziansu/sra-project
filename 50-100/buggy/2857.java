@java.lang.Override
public void onClick(android.view.View v) {
    if ((com.zerohour.fragments.PartyInviteFragment.contactsListModel.size()) > 0) {
        for (java.lang.String mNum : com.zerohour.fragments.PartyInviteFragment.contactsListModel) {
            if (!(numbersSelected.contains(mNum)))
                numbersSelected.add(mNum);
            
        }
        updateData();
    }
    com.zerohour.utils.Utility.showToastMessage(getActivity(), ("SELECTED CONTACTS" + (com.zerohour.fragments.PartyInviteFragment.contactsListModel.size())));
    com.zerohour.fragments.PartyInviteFragment.contactsListModel.clear();
    dialog.dismiss();
}