public static java.lang.String lookAndSay(java.lang.String start, int num) {
    int length = num;
    if (length <= 0) {
        return "";
    }
    java.lang.String data = start;
    while ((length--) > 0) {
        data = com.barbarum.tutorial.atlassian.Q2LookAndSay.lookAndSay(data);
    } 
    return data;
}