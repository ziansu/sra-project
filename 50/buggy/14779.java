public boolean setSubject(java.lang.String mailSubject) {
    java.lang.System.out.println("定义邮件主题！");
    try {
        mimeMsg.setSubject(("" + mailSubject));
        return true;
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("定义邮件主题发生错误！");
        return false;
    }
}