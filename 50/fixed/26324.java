public void removeMember(droidsquad.voyage.model.objects.Member member) {
    int pos = this.mMembers.indexOf(member);
    if (pos != (-1)) {
        this.mMembers.remove(pos);
        notifyItemRemoved(pos);
    }
}