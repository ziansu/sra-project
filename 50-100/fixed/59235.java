@java.lang.Override
public int compare(com.example.velibisk.rssreader.ui.ListItem lhs, com.example.velibisk.rssreader.ui.ListItem rhs) {
    final long ldate = lhs.getDate().getTime();
    final long rdate = rhs.getDate().getTime();
    return ldate < rdate ? 1 : ldate == rdate ? 0 : -1;
}