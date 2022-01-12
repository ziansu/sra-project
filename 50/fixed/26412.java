public boolean isMemberLive(org.jgroups.View view) {
    return view.containsMember(dest);
}