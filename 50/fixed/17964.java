@java.lang.Override
public int compare(hu.bugbusters.corpus.core.bean.Inbox o1, hu.bugbusters.corpus.core.bean.Inbox o2) {
    return o2.getMessage().getTime().compareTo(o1.getMessage().getTime());
}