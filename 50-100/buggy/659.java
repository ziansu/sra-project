@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent ev) {
    if (!(ev.getValueIsAdjusting())) {
        int position = list_member.getSelectedIndex();
        goldengymclub.util.Member member = filteredMemberList.get(position);
        new goldengymclub.MemberDetailsDialog(member).show();
    }
}