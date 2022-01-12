@java.lang.Override
public void onResume() {
    super.onResume();
    SetSubbed(CacheChats.Subs.contains(CurrentChat));
}