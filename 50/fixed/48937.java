@java.lang.Override
public int compare(com.togglecorp.chat.Message m1, com.togglecorp.chat.Message m2) {
    return java.lang.Long.valueOf(m1.time_sent).compareTo(m2.time_sent);
}