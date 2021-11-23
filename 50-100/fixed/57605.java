public static void sendMail(java.lang.String to, java.lang.String text, java.lang.String html, java.lang.String filePath) throws javax.mail.MessagingException {
    io.github.biezhi.ome.OhMyEmail.subject((("来自" + (ning.zhou.common.utils.SendEmailUtils.SYSTEM_STR)) + "的邮件")).from(ning.zhou.common.utils.SendEmailUtils.SYSTEM_STR).to(to).text(text).html(html).send();
}