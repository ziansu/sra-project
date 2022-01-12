public static java.lang.String lookAndSay(java.lang.String start, int num) {
    if (num <= 0) {
        return "";
    }
    java.lang.String data = start;
    while ((num--) > 0) {
        data = com.barbarum.tutorial.atlassian.Q2LookAndSay.lookAndSay(data);
    } 
    return data;
}